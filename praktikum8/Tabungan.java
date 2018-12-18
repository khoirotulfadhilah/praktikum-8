
package praktikum8;


class Tabungan {
    
    int saldo;
    Tabungan(int inisaldo){
        this.saldo=inisaldo;
    }
    
    public void ambilUang(int jumlah){
        this.saldo=(saldo-jumlah);
    }
}
