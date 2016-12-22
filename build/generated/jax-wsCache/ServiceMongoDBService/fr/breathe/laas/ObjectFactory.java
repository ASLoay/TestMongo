
package fr.breathe.laas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.breathe.laas package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeleteAllDocuments_QNAME = new QName("http://laas.breathe.fr/", "deleteAllDocuments");
    private final static QName _DeleteDocument_QNAME = new QName("http://laas.breathe.fr/", "deleteDocument");
    private final static QName _InsertDocument_QNAME = new QName("http://laas.breathe.fr/", "insertDocument");
    private final static QName _CreateDB_QNAME = new QName("http://laas.breathe.fr/", "createDB");
    private final static QName _InsertDocumentResponse_QNAME = new QName("http://laas.breathe.fr/", "insertDocumentResponse");
    private final static QName _DeleteCollectionResponse_QNAME = new QName("http://laas.breathe.fr/", "deleteCollectionResponse");
    private final static QName _DeleteAllDocumentsResponse_QNAME = new QName("http://laas.breathe.fr/", "deleteAllDocumentsResponse");
    private final static QName _DeleteCollection_QNAME = new QName("http://laas.breathe.fr/", "deleteCollection");
    private final static QName _DeleteDatabaseResponse_QNAME = new QName("http://laas.breathe.fr/", "deleteDatabaseResponse");
    private final static QName _DeleteDocumentResponse_QNAME = new QName("http://laas.breathe.fr/", "deleteDocumentResponse");
    private final static QName _DeleteDatabase_QNAME = new QName("http://laas.breathe.fr/", "deleteDatabase");
    private final static QName _CreateDBResponse_QNAME = new QName("http://laas.breathe.fr/", "createDBResponse");
    private final static QName _CreateCollectionResponse_QNAME = new QName("http://laas.breathe.fr/", "createCollectionResponse");
    private final static QName _CreateCollection_QNAME = new QName("http://laas.breathe.fr/", "createCollection");
    private final static QName _GetQueryResponse_QNAME = new QName("http://laas.breathe.fr/", "getQueryResponse");
    private final static QName _GetQuery_QNAME = new QName("http://laas.breathe.fr/", "getQuery");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.breathe.laas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteDatabaseResponse }
     * 
     */
    public DeleteDatabaseResponse createDeleteDatabaseResponse() {
        return new DeleteDatabaseResponse();
    }

    /**
     * Create an instance of {@link GetQuery }
     * 
     */
    public GetQuery createGetQuery() {
        return new GetQuery();
    }

    /**
     * Create an instance of {@link InsertDocumentResponse }
     * 
     */
    public InsertDocumentResponse createInsertDocumentResponse() {
        return new InsertDocumentResponse();
    }

    /**
     * Create an instance of {@link DeleteDatabase }
     * 
     */
    public DeleteDatabase createDeleteDatabase() {
        return new DeleteDatabase();
    }

    /**
     * Create an instance of {@link DeleteCollectionResponse }
     * 
     */
    public DeleteCollectionResponse createDeleteCollectionResponse() {
        return new DeleteCollectionResponse();
    }

    /**
     * Create an instance of {@link GetQueryResponse }
     * 
     */
    public GetQueryResponse createGetQueryResponse() {
        return new GetQueryResponse();
    }

    /**
     * Create an instance of {@link CreateCollectionResponse }
     * 
     */
    public CreateCollectionResponse createCreateCollectionResponse() {
        return new CreateCollectionResponse();
    }

    /**
     * Create an instance of {@link InsertDocument }
     * 
     */
    public InsertDocument createInsertDocument() {
        return new InsertDocument();
    }

    /**
     * Create an instance of {@link CreateCollection }
     * 
     */
    public CreateCollection createCreateCollection() {
        return new CreateCollection();
    }

    /**
     * Create an instance of {@link CreateDB }
     * 
     */
    public CreateDB createCreateDB() {
        return new CreateDB();
    }

    /**
     * Create an instance of {@link DeleteDocumentResponse }
     * 
     */
    public DeleteDocumentResponse createDeleteDocumentResponse() {
        return new DeleteDocumentResponse();
    }

    /**
     * Create an instance of {@link DeleteDocument }
     * 
     */
    public DeleteDocument createDeleteDocument() {
        return new DeleteDocument();
    }

    /**
     * Create an instance of {@link DeleteCollection }
     * 
     */
    public DeleteCollection createDeleteCollection() {
        return new DeleteCollection();
    }

    /**
     * Create an instance of {@link DeleteAllDocuments }
     * 
     */
    public DeleteAllDocuments createDeleteAllDocuments() {
        return new DeleteAllDocuments();
    }

    /**
     * Create an instance of {@link DeleteAllDocumentsResponse }
     * 
     */
    public DeleteAllDocumentsResponse createDeleteAllDocumentsResponse() {
        return new DeleteAllDocumentsResponse();
    }

    /**
     * Create an instance of {@link CreateDBResponse }
     * 
     */
    public CreateDBResponse createCreateDBResponse() {
        return new CreateDBResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAllDocuments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://laas.breathe.fr/", name = "deleteAllDocuments")
    public JAXBElement<DeleteAllDocuments> createDeleteAllDocuments(DeleteAllDocuments value) {
        return new JAXBElement<DeleteAllDocuments>(_DeleteAllDocuments_QNAME, DeleteAllDocuments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://laas.breathe.fr/", name = "deleteDocument")
    public JAXBElement<DeleteDocument> createDeleteDocument(DeleteDocument value) {
        return new JAXBElement<DeleteDocument>(_DeleteDocument_QNAME, DeleteDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://laas.breathe.fr/", name = "insertDocument")
    public JAXBElement<InsertDocument> createInsertDocument(InsertDocument value) {
        return new JAXBElement<InsertDocument>(_InsertDocument_QNAME, InsertDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://laas.breathe.fr/", name = "createDB")
    public JAXBElement<CreateDB> createCreateDB(CreateDB value) {
        return new JAXBElement<CreateDB>(_CreateDB_QNAME, CreateDB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertDocumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://laas.breathe.fr/", name = "insertDocumentResponse")
    public JAXBElement<InsertDocumentResponse> createInsertDocumentResponse(InsertDocumentResponse value) {
        return new JAXBElement<InsertDocumentResponse>(_InsertDocumentResponse_QNAME, InsertDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCollectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://laas.breathe.fr/", name = "deleteCollectionResponse")
    public JAXBElement<DeleteCollectionResponse> createDeleteCollectionResponse(DeleteCollectionResponse value) {
        return new JAXBElement<DeleteCollectionResponse>(_DeleteCollectionResponse_QNAME, DeleteCollectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAllDocumentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://laas.breathe.fr/", name = "deleteAllDocumentsResponse")
    public JAXBElement<DeleteAllDocumentsResponse> createDeleteAllDocumentsResponse(DeleteAllDocumentsResponse value) {
        return new JAXBElement<DeleteAllDocumentsResponse>(_DeleteAllDocumentsResponse_QNAME, DeleteAllDocumentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://laas.breathe.fr/", name = "deleteCollection")
    public JAXBElement<DeleteCollection> createDeleteCollection(DeleteCollection value) {
        return new JAXBElement<DeleteCollection>(_DeleteCollection_QNAME, DeleteCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDatabaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://laas.breathe.fr/", name = "deleteDatabaseResponse")
    public JAXBElement<DeleteDatabaseResponse> createDeleteDatabaseResponse(DeleteDatabaseResponse value) {
        return new JAXBElement<DeleteDatabaseResponse>(_DeleteDatabaseResponse_QNAME, DeleteDatabaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDocumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://laas.breathe.fr/", name = "deleteDocumentResponse")
    public JAXBElement<DeleteDocumentResponse> createDeleteDocumentResponse(DeleteDocumentResponse value) {
        return new JAXBElement<DeleteDocumentResponse>(_DeleteDocumentResponse_QNAME, DeleteDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDatabase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://laas.breathe.fr/", name = "deleteDatabase")
    public JAXBElement<DeleteDatabase> createDeleteDatabase(DeleteDatabase value) {
        return new JAXBElement<DeleteDatabase>(_DeleteDatabase_QNAME, DeleteDatabase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDBResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://laas.breathe.fr/", name = "createDBResponse")
    public JAXBElement<CreateDBResponse> createCreateDBResponse(CreateDBResponse value) {
        return new JAXBElement<CreateDBResponse>(_CreateDBResponse_QNAME, CreateDBResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCollectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://laas.breathe.fr/", name = "createCollectionResponse")
    public JAXBElement<CreateCollectionResponse> createCreateCollectionResponse(CreateCollectionResponse value) {
        return new JAXBElement<CreateCollectionResponse>(_CreateCollectionResponse_QNAME, CreateCollectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://laas.breathe.fr/", name = "createCollection")
    public JAXBElement<CreateCollection> createCreateCollection(CreateCollection value) {
        return new JAXBElement<CreateCollection>(_CreateCollection_QNAME, CreateCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQueryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://laas.breathe.fr/", name = "getQueryResponse")
    public JAXBElement<GetQueryResponse> createGetQueryResponse(GetQueryResponse value) {
        return new JAXBElement<GetQueryResponse>(_GetQueryResponse_QNAME, GetQueryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://laas.breathe.fr/", name = "getQuery")
    public JAXBElement<GetQuery> createGetQuery(GetQuery value) {
        return new JAXBElement<GetQuery>(_GetQuery_QNAME, GetQuery.class, null, value);
    }

}
