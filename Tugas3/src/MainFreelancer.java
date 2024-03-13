    package Tugas3.src;

    import java.util.Scanner;

    public class MainFreelancer {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            String nama;
            int umur = 0;
            String pendidikanTerakhir;
            double gaji = 0;

            // NAMA
            do {
                System.out.print("Masukkan nama freelancer: ");
                nama = scanner.nextLine();
            } while (nama.isEmpty());

            // UMUR
            do {
                System.out.print("Masukkan umur freelancer: ");
                String inputUmur = scanner.nextLine();
                try {
                    umur = Integer.parseInt(inputUmur);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Masukkan umur dengan angka.");
                }
            } while (true);

            //PENDIDIKAN TERAKHIR
            System.out.print("Masukkan pendidikan terakhir freelancer: ");
            pendidikanTerakhir = scanner.nextLine();

            // GAJI
            do {
                System.out.print("Masukkan gaji freelancer: ");
                String inputGaji = scanner.nextLine();
                try {
                    gaji = Double.parseDouble(inputGaji);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Masukkan gaji dengan angka.");
                }
            } while (true);

        
            FreelancerDesigner freelancer = new FreelancerDesigner(nama, umur, pendidikanTerakhir, gaji);
            
            clearScreen();


            System.out.println("Kita suruh barista ngapain nih? : ");
            System.out.println("1. Mendesign");
            System.out.println("2. Revisian");
            System.out.println("3. Begadang");
            System.out.print("Masukkan pilihan Anda (1/2/3): ");
            int pilihan;
            do {
                String inputPilihan = scanner.nextLine();
                try {
                    pilihan = Integer.parseInt(inputPilihan);
                    if (pilihan >= 1 && pilihan <= 3) {
                        break;
                    } else {
                        System.out.println("Masukkan pilihan yang valid (1/2/3).");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Masukkan pilihan dengan angka (1/2/3).");
                }
            } while (true);
            
            clearScreen();
            
            System.out.println("Data freelancer:");
            System.out.println("Nama: " + freelancer.getNama());
            System.out.println("Umur: " + freelancer.getUmur());
            System.out.println("Pendidikan Terakhir: " + freelancer.getPendidikanTerakhir());
            System.out.println("Gaji: " + freelancer.getGaji());

            switch (pilihan) {
                case 1:
                    freelancer.mendesign(123);
                    break;
                case 2:
                    freelancer.revisian();
                    break;
                case 3:
                    freelancer.begadang();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            
            scanner.close();
        }

        // biar clean aja
        public static void clearScreen() {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
