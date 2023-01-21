#include <stdio.h>
#include <stdlib.h>
#include <conio.h> 

/*listedeki d???mlerin veri yap?s? tan?mlanmas?*/ 
typedef struct topluluk{ 
int bilgi;
char mesaj[100];
struct topluluk *arka;
}BLISTE; 
 
/*listenin ilk ve son d???m adreslerini tutan i?aret?ileri*/
BLISTE *ilk = NULL, *son=NULL; 
 
/*fonksiyon bildirimleri*/ 
BLISTE *ara(int); 
BLISTE *sil(int); 
BLISTE *okuKlavye(); 
int listele(); 
int ekle(BLISTE *); 
void yazEkrana(BLISTE *); 
 
/*ana program*/ 
int main() {
  BLISTE *eklenecek,*ki;
  int bilgi,sonuc;  
  char secim;  
  while(1){/*sonsuz cevrim*/   
    puts("\nEkleme\nListeleme\nArama\nSilme\nCikis\nSeciminiz?");   
    secim=getch();
        
	//printf("Secim=%d\n",secim);   
    switch(secim){   
         case 'E': eklenecek = okuKlavye();
		       if(eklenecek != NULL)
			         ekle(eklenecek); 
			    else     
				     puts("Ekleme icin bellek dolu\n");    
			     break;   
		 case  'L': sonuc = listele();
		          if(sonuc==-1) 
			       puts("Bos Liste !");
			      break;
	     case  'A': puts("Aranan:"); 
		           scanf("%d",&bilgi);
				   ki=ara(bilgi);
				   if(ki == NULL)
				        puts("Aranan bulunamadi");
				   else 
				        yazEkrana(ki);
						break;  
		case   'S': puts("Silinecek:"); 
		          scanf("%d",&bilgi);
				  ki = sil(bilgi);
				  if(ki != NULL)  
				        puts("Silindi...");
				  else  
				        puts("Silinmek istenen yok...");
						break;
		case   'C': puts("Hoscakal!");    
		          exit(0);   
		default: puts("Yanlis Secim!!!\n"); 
    } /* switch sonu */  
   } /* while d?ng?s? sonu */  
  return 0; 
  } /* main sonu */ 
 
/* kay?t ekleme fonksiyonu */ 
int ekle(BLISTE *ki) {  
    if( ilk != NULL){   //ilk eleman de?il ise
	    son->arka = ki;   
		son = ki;   
		son->arka = NULL;  
	}  else  { //ilk eleman ise
	          ilk = ki;
			  son = ilk;
			  ilk->arka = NULL;  
			  }  
 return 0; 
} 
 
/*listedeki t?m kay?tlar? listeleme*/ 
int listele() {  
BLISTE *p;  
p = ilk; /*listenin ba?lang?? adresi p'ye al?n?yor*/  
     if(p==NULL) 
	    return -1; /*bo? liste*/  
while(p){  /*NULL olana kadar d?n?l?r*/   
yazEkrana(p);   
p = p->arka;  
}  
return 0; /*listeleme yap?ld? anlam?nda*/ 
} 
 
/*liste ?zerinde bir kay?t arama*/ 
BLISTE *ara(int aranan) {  
BLISTE *p;  
p = ilk;  
   while(p){   
      if( p->bilgi == aranan) /*aranan m??*/    
	    return p; /*evet ise adresini g?nder*/   
		p = p->arka; /*hay?r ise bir sonrakine ge?*/  
    }   
return NULL; /*bulunamam?? ise NULL g?nder*/ 
} 
 
/*listeden bir kay?t silme*/ 
BLISTE *sil(int silinecek) {  
BLISTE *p,*bironceki;  
p = ilk;  
bironceki = NULL;  
  while(p){  /*silinecek olan aran?yor...*/   
      if(silinecek == p->bilgi)    
	     break;   
		 bironceki = p;   
		 p = p->arka;  
   } /*silinecek listede varsa o ve bir ?nceki bulundu*/  
   if( p != NULL){ 
      if(bironceki == NULL){ /*silinecek olan birinci d???m!*/    
	     if( ilk == son ){ /*listede yaln?zca 1 d???m varsa*/     
		    ilk = NULL;     
		    son = NULL;    
		 } else{ //Birden fazla d???m var ise ve silinecek ilk d???m ise
		        ilk = ilk->arka;
			}
	  } else{ /*silinecek olan aradan bir d???m*/ 
		     bironceki->arka = p->arka; //K?sa devre   
				if(bironceki->arka == NULL)    
					 son = bironceki; /*silinen son d???m*/   
			 }   
	    free(p); /*alan serbest b?rak?l?yor*/  
	  return p; /* NULL'dan farkl? adrese g?nderiliyor*/ 
	}  else {
	         return NULL; /*silinmek istenen listede yok*/ 
			 }	
  } //Sil
 
/*bir kay?t bilgisini ekrana yazar*/ 
void yazEkrana(BLISTE *yazilacak) {  
      printf("bilgi:%d, mesaj:%s\n",yazilacak->bilgi,yazilacak->mesaj);
} 
 
/*bir kay?t bilgisini klavyeden okur;dinamik olarak yerle?tirir*/
BLISTE *okuKlavye() {  
   BLISTE *okunan;  
   okunan =(BLISTE*)malloc(sizeof(BLISTE)); /* dinamik olarak yer isteniyor*/  
        if(okunan == NULL) /*bo? yer verildi mi?*/  
		   return NULL; /*bo? yer yok ise NULL gelir*/ 
 
 puts("Bilgi giriniz:"); 
 scanf("%d",&(okunan->bilgi));  
 puts("Mesaj giriniz:");   
 scanf("%s",okunan->mesaj); 
 return okunan; /*bilginin yerle?tirildi?i adres g?nderiliyor */
} 
 
