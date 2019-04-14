package com.gkhn.openclosed;
/*OCP ye göre programlar geliştirmeye açık olmalıdır, yani programı oluşturan modüller yeni davranış
biçimlerini sergileyecek şekilde genişletilebilmelidirler. Bir modüle yeni bir davranış biçimi
kazandırılarak düşünülen değişiklik sağlanır. Bu yeni kod yazılarak gerçekleştirilir ( bu yüzden bu
işleme değiştirme değil, genişletme denir), mevcut kodu değiştirerek değil!*/

public class RemoteControl {
//Bu şekilde oluşturulan bir tasarım OCP prensibine ters düşmektedir, çünkü her yeni eklenen alet
//için on() ve off() metotlarında değişiklik yapmamız gerekmektedir.
/*    public void on(Object obj)
    {
        if(obj instanceof TV){
            ((TV)obj).tvOn();
        }
        else if(obj instanceof CDPlayer){
            ((CDPlayer)obj).cdOn();
        }
    }
    public void off(Object obj)
    {
        if(obj instanceof TV)
        {
            ((TV)obj).tvOff();
        }
        else if(obj instanceof CDPlayer)
        {
            ((CDPlayer)obj).cdOff();
        }
    }*/
    private RemoteControlInterface remote;

    public RemoteControl(RemoteControlInterface _remote)
    {
        this.remote = _remote;
    }
    public void on()
    {
        remote.on();
    }

    public void off()
    {
        remote.off();
    }
}
