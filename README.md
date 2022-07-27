# doccsapp20221
Application for management file documents
Aspectos Para Revisar en esta nueva versión
1.	En las clases Organization, Document y Person se implementó la interfaz Comparable, la cual requiere el desarrollo de un método llamado compareTo:
public int compareTo(Object o) {
        Person person = (Person) o;
        return this.getFullName().compareTo(person.getFullName());
    }
Este método compara un atributo de dos objetos del mismo tipo, determinando cual es menor que el otro y se usa para ordenar una colección de objetos.
2.	En la clase Client, se agregó el atributo:
private Organization org;
Se crearon dos constructores adicionales, se agregaron métodos get y set, y se modificó el método toString(), para estas modificaciones.
3.	Se creo un package denominado util para agregar clases que son transversales a la aplicación. Revisar su contenido y entenderlo.
4.	En la clase ClientEdit, se realizó:
-	Se agregó un campo de tipo Check-box para el atributo state.
-	Se cambio el control para el atributo type, cambiado el Text Box por un Combo Box.
-	Se incluyo un control de tipo List, para listar las Organizaciones que están en el archivo de datos.
-	Se agrego este atributo de clase:
private  ArrayList<Organization> listOrganization;
-	Se programo un método public void loadOrganizationJList() para que cuando se inicie la forma, se carguen los datos del archivo de organizaciones en la lista. Es muy importante entender este método porque incluye la instrucción Collections.sort(listOrganization) para ordenar la colección de objetos de Organizaciones.
-	Se modifico el método private void clientSaveBtnActionPerformed(java.awt.event.ActionEvent evt) para los cambios realizados.
-	Se programo el método private void clientEmailTxtFFocusLost(java.awt.event.FocusEvent evt) para la validación del campo de tipo email.
-	Se modificó la clase ClientList para visualizar y borrar un cliente de la lista.
-	Se programao lo relacionado con la actualización de Clientes
