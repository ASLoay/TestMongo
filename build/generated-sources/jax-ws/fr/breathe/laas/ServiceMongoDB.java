
package fr.breathe.laas;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3.3-hudson-757-SNAPSHOT
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ServiceMongoDB", targetNamespace = "http://laas.breathe.fr/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServiceMongoDB {


    /**
     * 
     * @param port
     * @param dbName
     * @param query
     * @param collectionName
     * @param ip
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getQuery", targetNamespace = "http://laas.breathe.fr/", className = "fr.breathe.laas.GetQuery")
    @ResponseWrapper(localName = "getQueryResponse", targetNamespace = "http://laas.breathe.fr/", className = "fr.breathe.laas.GetQueryResponse")
    public String getQuery(
        @WebParam(name = "ip", targetNamespace = "")
        String ip,
        @WebParam(name = "port", targetNamespace = "")
        int port,
        @WebParam(name = "dbName", targetNamespace = "")
        String dbName,
        @WebParam(name = "collectionName", targetNamespace = "")
        String collectionName,
        @WebParam(name = "query", targetNamespace = "")
        String query);

    /**
     * 
     * @param port
     * @param dbName
     * @param nameCollection
     * @param ip
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createCollection", targetNamespace = "http://laas.breathe.fr/", className = "fr.breathe.laas.CreateCollection")
    @ResponseWrapper(localName = "createCollectionResponse", targetNamespace = "http://laas.breathe.fr/", className = "fr.breathe.laas.CreateCollectionResponse")
    public Boolean createCollection(
        @WebParam(name = "ip", targetNamespace = "")
        String ip,
        @WebParam(name = "port", targetNamespace = "")
        int port,
        @WebParam(name = "dbName", targetNamespace = "")
        String dbName,
        @WebParam(name = "nameCollection", targetNamespace = "")
        String nameCollection);

    /**
     * 
     * @param port
     * @param dbName
     * @param ip
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createDB", targetNamespace = "http://laas.breathe.fr/", className = "fr.breathe.laas.CreateDB")
    @ResponseWrapper(localName = "createDBResponse", targetNamespace = "http://laas.breathe.fr/", className = "fr.breathe.laas.CreateDBResponse")
    public Boolean createDB(
        @WebParam(name = "ip", targetNamespace = "")
        String ip,
        @WebParam(name = "port", targetNamespace = "")
        int port,
        @WebParam(name = "dbName", targetNamespace = "")
        String dbName);

    /**
     * 
     * @param port
     * @param document
     * @param nameDB
     * @param nameCollection
     * @param ip
     */
    @WebMethod
    @RequestWrapper(localName = "insertDocument", targetNamespace = "http://laas.breathe.fr/", className = "fr.breathe.laas.InsertDocument")
    @ResponseWrapper(localName = "insertDocumentResponse", targetNamespace = "http://laas.breathe.fr/", className = "fr.breathe.laas.InsertDocumentResponse")
    public void insertDocument(
        @WebParam(name = "ip", targetNamespace = "")
        String ip,
        @WebParam(name = "port", targetNamespace = "")
        int port,
        @WebParam(name = "nameDB", targetNamespace = "")
        String nameDB,
        @WebParam(name = "nameCollection", targetNamespace = "")
        String nameCollection,
        @WebParam(name = "document", targetNamespace = "")
        String document);

    /**
     * 
     * @param port
     * @param nameDB
     * @param nameCollection
     * @param ip
     */
    @WebMethod
    @RequestWrapper(localName = "deleteCollection", targetNamespace = "http://laas.breathe.fr/", className = "fr.breathe.laas.DeleteCollection")
    @ResponseWrapper(localName = "deleteCollectionResponse", targetNamespace = "http://laas.breathe.fr/", className = "fr.breathe.laas.DeleteCollectionResponse")
    public void deleteCollection(
        @WebParam(name = "ip", targetNamespace = "")
        String ip,
        @WebParam(name = "port", targetNamespace = "")
        int port,
        @WebParam(name = "nameDB", targetNamespace = "")
        String nameDB,
        @WebParam(name = "nameCollection", targetNamespace = "")
        String nameCollection);

    /**
     * 
     * @param port
     * @param nameDB
     * @param ip
     */
    @WebMethod
    @RequestWrapper(localName = "deleteDatabase", targetNamespace = "http://laas.breathe.fr/", className = "fr.breathe.laas.DeleteDatabase")
    @ResponseWrapper(localName = "deleteDatabaseResponse", targetNamespace = "http://laas.breathe.fr/", className = "fr.breathe.laas.DeleteDatabaseResponse")
    public void deleteDatabase(
        @WebParam(name = "ip", targetNamespace = "")
        String ip,
        @WebParam(name = "port", targetNamespace = "")
        int port,
        @WebParam(name = "nameDB", targetNamespace = "")
        String nameDB);

    /**
     * 
     * @param port
     * @param nameDB
     * @param nameCollection
     * @param ip
     */
    @WebMethod
    @RequestWrapper(localName = "deleteAllDocuments", targetNamespace = "http://laas.breathe.fr/", className = "fr.breathe.laas.DeleteAllDocuments")
    @ResponseWrapper(localName = "deleteAllDocumentsResponse", targetNamespace = "http://laas.breathe.fr/", className = "fr.breathe.laas.DeleteAllDocumentsResponse")
    public void deleteAllDocuments(
        @WebParam(name = "ip", targetNamespace = "")
        String ip,
        @WebParam(name = "port", targetNamespace = "")
        int port,
        @WebParam(name = "nameDB", targetNamespace = "")
        String nameDB,
        @WebParam(name = "nameCollection", targetNamespace = "")
        String nameCollection);

    /**
     * 
     * @param port
     * @param query
     * @param nameDB
     * @param nameCollection
     * @param ip
     */
    @WebMethod
    @RequestWrapper(localName = "deleteDocument", targetNamespace = "http://laas.breathe.fr/", className = "fr.breathe.laas.DeleteDocument")
    @ResponseWrapper(localName = "deleteDocumentResponse", targetNamespace = "http://laas.breathe.fr/", className = "fr.breathe.laas.DeleteDocumentResponse")
    public void deleteDocument(
        @WebParam(name = "ip", targetNamespace = "")
        String ip,
        @WebParam(name = "port", targetNamespace = "")
        int port,
        @WebParam(name = "nameDB", targetNamespace = "")
        String nameDB,
        @WebParam(name = "nameCollection", targetNamespace = "")
        String nameCollection,
        @WebParam(name = "query", targetNamespace = "")
        String query);

}
