package PaticaStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class PaticaStore {

    public Scanner input = new Scanner(System.in);

    List<MobilePhone> mobiles = this.defaulMobile();
    List<NoteBook> noteBooks = this.defaultNotebook();

    public List<MobilePhone> defaulMobile(){
        List<MobilePhone> productList = new ArrayList<>();
        productList.add(new MobilePhone(1, 3199, 0, 10, "GALAXY A51",
                new Samsung(), 128, 6.5,4000, 6, "Siyah"));
        productList.add(new MobilePhone(2, 7379, 0,10, "iPhone 11 64 GB",
                new Apple(), 64, 6.1,3046, 6, "Mavi"));

        return  productList;
    }

    public List<NoteBook> defaultNotebook(){
        List<NoteBook> productList = new ArrayList<>();
        productList.add(new NoteBook(1, 7000, 0, 10, "Matebook 14",
                new Huawei(), 512, 14,16));
        return productList;
    }

    public PaticaStore(){
        System.out.println("PatikaStore Ürün Yönetim Paneli !");

        boolean flag = true;
        while(flag){
            System.out.println("1 - Notebook İşlemleri\n" +
                    "2 - Cep Telefonu İşlemleri\n" +
                    "3 - Marka Listele\n" +
                    "4 - Yeni Ürün Kayıt\n" +
                    "0 - Çıkış Yap");
            System.out.print("Tercihiniz: ");
            int option  = input.nextInt();
            if(option == 1){
                this.getAllNotebook(noteBooks);
                System.out.print("Ürün tercihiniz:");
                int selectendId = input.nextInt();
                this.getNotebookById(selectendId);
            }else if(option == 2){
                this.getAllMobilePhone(mobiles);
                System.out.print("Ürün tercihiniz:");
                int selectendId = input.nextInt();
                this.getMobilePhoneById(selectendId);
            }else if(option == 3){
                this.brandDetails();
            }else if(option == 4){
                this.addProduct();
            }else if(option == 0){
                System.out.println("Çıkış yapılıyor...");
                flag =false;
           }
        }
    }

    public void brandDetails(){
        while (true){
            this.allBrands();
            System.out.println("0 | Çıkış Yapınız");
            System.out.print("Tercihiniz:");
            int selectendId = input.nextInt();
            if(selectendId == 0){
                break;
            }
            this.getMobilePhoneByBrand(selectendId);
            this.getNotebookByBrand(selectendId);
        }
    }

    public void allBrands(){
        System.out.println("Markalarımız");
        System.out.println("--------------------");
        for(Brand b : Brand.allBrand()){
            System.out.println(b.getId() +" | "+b.getName());
        }
    }

    public void addProduct(){
        System.out.println("Ürün ekleme sayfası");
        System.out.print("<T>elefon veya <N>otebook:");
        String selection = input.nextLine();
        selection = input.nextLine();
        if(selection.toUpperCase().equals("T")){
            MobilePhone mobilePhone = new MobilePhone();
            mobilePhone.setId(this.getMobiles().size()+1);

            System.out.print("Ürün adı: ");
            mobilePhone.setProductName(input.nextLine());

            System.out.print("Ürün fiyatı:");
            mobilePhone.setPrice(input.nextDouble());

            System.out.print("İndirim oranı: ");
            mobilePhone.setRateOfDiscount(input.nextInt());

            System.out.print("Stok: ");
            mobilePhone.setStock(input.nextInt());

            this.allBrands();
            System.out.print("Marka ID: ");
            mobilePhone.setBrand(Brand.getById(input.nextInt()));

            //Devamı buraya
            this.getMobiles().add(mobilePhone);
            System.out.println("Ürün kaydı başarılı");
            this.getAllMobilePhone(this.getMobiles());
        }else if(selection.toUpperCase().equals("N")){
            NoteBook noteBook = new NoteBook();
            noteBook.setId(this.getNoteBooks().size()+1);

            System.out.print("Ürün adı: ");
            noteBook.setProductName(input.nextLine());

            System.out.print("Ürün fiyatı:");
            noteBook.setPrice(input.nextDouble());

            System.out.print("İndirim oranı: ");
            noteBook.setRateOfDiscount(input.nextInt());

            System.out.print("Stok: ");
            noteBook.setStock(input.nextInt());

            this.allBrands();
            System.out.print("Marka ID: ");
            noteBook.setBrand(Brand.getById(input.nextInt()));

            //Devamı buraya
            this.getNoteBooks().add(noteBook);
            System.out.println("Ürün kaydı başarılı");
            this.getAllNotebook(this.getNoteBooks());
        }else{
            System.out.println("Tanımsız seçenek");
        }
    }

    public void getAllNotebook(List<NoteBook> noteBooks){
        System.out.println("Notebook Listesi");
        System.out.println("\n----------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı\t\t\t\t | Fiyat\t| Marka\t | Depolama\t| Ekran\t | Ram\t|");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (NoteBook p  : noteBooks){
            System.out.println("| "+p.getId()+" | "+ p.getBrand().getName()+" " + p.getProductName()+"\t\t| "+
                    p.getPrice()+" |\t"+p.getBrand().getName()+" |\t"+p.getMemory()+" |\t"+p.getScreenSize()+" |\t"+ p.getRAM());
        }
        System.out.println("----------------------------------------------------------------------------------------------------\n");
    }

    public void getAllMobilePhone(List<MobilePhone> mobilePhones){
        System.out.println("\nCep Telefonu Listesi");
        System.out.println("\n----------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı\t\t\t\t | Fiyat\t| Marka\t | Depolama\t| Ekran\t | Pil\t| RAM\t| Renk\t|");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (MobilePhone p  : mobilePhones){
            System.out.println("| "+p.getId()+" | "+ p.getBrand().getName() +" " + p.getProductName()+"\t\t| "+
                    p.getPrice()+" |\t"+p.getBrand().getName()+" |\t"+p.getMemory()+" |\t"+p.getScreenSize()+" |\t"+ p.getBattery()
                    +" |\t"+ p.getRAM()+" |\t"+ p.getColor());
        }
        System.out.println("----------------------------------------------------------------------------------------------------\n");
    }

    public void getNotebookById(int Id){
        boolean flag = true;
        for (NoteBook p  : this.getNoteBooks()){
            if(p.getId() == Id) {
                List<NoteBook> n = new ArrayList<>();
                n.add(p);
                this.getAllNotebook(n);
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("Ürün bulunamadı !");
    }

    public void getMobilePhoneById(int Id){
        boolean flag = true;
        for (MobilePhone p  : this.getMobiles()){
            if(p.getId() == Id) {
                List<MobilePhone> m = new ArrayList<>();
                m.add(p);
                this.getAllMobilePhone(m);
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("Ürün bulunamadı !");
    }

    public void getNotebookByBrand(int brandId){
        List<NoteBook> noteBookList =  new ArrayList<>();
        for(NoteBook n : this.getNoteBooks()){
            if(n.getBrand().getId() == brandId){
                noteBookList.add(n);
            }
        }
        this.getAllNotebook(noteBookList);
    }

    public void getMobilePhoneByBrand(int brandId){
        List<MobilePhone> mobilePhoneList = new ArrayList<>();
        for(MobilePhone m : this.getMobiles()){
            if(m.getBrand().getId() == brandId){
                mobilePhoneList.add(m);
            }
        }
        this.getAllMobilePhone(mobilePhoneList);
    }

    public List<MobilePhone> getMobiles() {
        return mobiles;
    }

    public void setMobiles(List<MobilePhone> mobiles) {
        this.mobiles = mobiles;
    }

    public List<NoteBook> getNoteBooks() {
        return noteBooks;
    }

    public void setNoteBooks(List<NoteBook> noteBooks) {
        this.noteBooks = noteBooks;
    }
}
