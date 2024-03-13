package Tugas3.src;

public class AnggotaTeamProject {
    private String nama;
    private String role;
    private int umur;

    public AnggotaTeamProject(String nama, String role, int umur) {
        this.nama = nama;
        this.role = role;
        this.umur = umur;
    }

    public void kumpulkanPekerjaan(String tugas) {
        System.out.println("Anggota tim " + role + " " + nama + " telah menyelesaikan tugas: " + tugas);
    }

    public void hapusPekerjaan(String tugas) {
        System.out.println("Anggota tim " + role + " " + nama + " telah menghapus tugas: " + tugas);
    }

    public void presentasi() {
        System.out.println("Anggota tim " + role + " " + nama + " sedang melakukan presentasi.");
    }

    public void brainstorming() {
        System.out.println("Anggota tim " + role + " " + nama + " sedang melakukan brainstorming.");
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
