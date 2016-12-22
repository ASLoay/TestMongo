/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author loay
 */
public class Test {
    public static void main(String args[]){

        try { // Call Web Service Operation
            fr.breathe.laas.ServiceMongoDBService service = new fr.breathe.laas.ServiceMongoDBService();
            fr.breathe.laas.ServiceMongoDB port = service.getServiceMongoDBPort();
            // TODO initialize WS operation arguments here
            java.lang.String ip = "localhost";
            int p = 27017;
            java.lang.String dbName = "Loay";
            // TODO process result here
            java.lang.Boolean result = port.createDB(ip, p, dbName);
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        try { // Call Web Service Operation
            fr.breathe.laas.ServiceMongoDBService service = new fr.breathe.laas.ServiceMongoDBService();
            fr.breathe.laas.ServiceMongoDB port = service.getServiceMongoDBPort();
            // TODO initialize WS operation arguments here
            java.lang.String ip = "localhost";
            int p = 27017;
            java.lang.String dbName = "Loay";
            java.lang.String nameCollection = "CollectionLoay";
            // TODO process result here
            java.lang.Boolean result = port.createCollection(ip, p, dbName, nameCollection);
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

        try { // Call Web Service Operation
            fr.breathe.laas.ServiceMongoDBService service = new fr.breathe.laas.ServiceMongoDBService();
            fr.breathe.laas.ServiceMongoDB port = service.getServiceMongoDBPort();
            // TODO initialize WS operation arguments here
            java.lang.String ip = "localhost";
            int p = 27017;
            java.lang.String nameDB = "Loay";
            java.lang.String nameCollection = "CollectionLoay";
            java.lang.String document = "{ item: \"gas\", percentage: 100 }";
            port.insertDocument(ip, p, nameDB, nameCollection, document);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }


        try { // Call Web Service Operation
            fr.breathe.laas.ServiceMongoDBService service = new fr.breathe.laas.ServiceMongoDBService();
            fr.breathe.laas.ServiceMongoDB port = service.getServiceMongoDBPort();
            // TODO initialize WS operation arguments here
            java.lang.String ip = "localhost";
            int p = 27017;
            java.lang.String dbName = "Loay";
            java.lang.String collectionName = "CollectionLoay";
            java.lang.String query = "{ item: \"gas\"}";
            // TODO process result here
            java.lang.String result = port.getQuery(ip, p, dbName, collectionName, query);
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }



        try { // Call Web Service Operation
            fr.breathe.laas.ServiceMongoDBService service = new fr.breathe.laas.ServiceMongoDBService();
            fr.breathe.laas.ServiceMongoDB port = service.getServiceMongoDBPort();
            // TODO initialize WS operation arguments here
            java.lang.String ip = "localhost";
            int p = 27017;
            java.lang.String nameDB = "Loay";
            port.deleteDatabase(ip, p, nameDB);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }




    }
}
