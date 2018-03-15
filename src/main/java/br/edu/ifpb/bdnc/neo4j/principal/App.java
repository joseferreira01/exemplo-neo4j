/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.neo4j.principal;

import java.io.File;
import java.util.Date;
import org.neo4j.graphalgo.GraphAlgoFactory;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.ResourceIterator;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

/**
 *
 * @author jose2
 */
public class App {

    public static void main(String[] args) {
        File flle = new File("/home/jose2/Documentos/01CURSOS/01ADS2016.2/B.D.N.C/aulas/banco.db");
        GraphDatabaseService graph = new GraphDatabaseFactory()
                .newEmbeddedDatabase(flle);

        try (Transaction tc = graph.beginTx()) {
//            Node no = graph.createNode(Label.label("pessoa"));
//            no.setProperty("cpf", "123.43");
//            no.setProperty("nome", "ana maria");
//            no.setProperty("idade", 52);

            Node no1 = graph.findNode(Label.label("pessoa"), "cpf", "123.43");
//           // ResourceIterator<Node> q = graph.findNodes(Label.label("pessoa"));
//           // Node no2 = graph.findNode(Label.label("pessoa"), "cpf", "123.436.321.43");
            System.err.println(no1.getAllProperties());
//        //    Relationship rel = no1.createRelationshipTo(no2, RelTipe.AMIGO);
////
////            rel.setProperty("desde", new Date());

//            System.err.println("re "+no1.getProperty("nome"));
graph.schema();
            tc.success();
        } finally {
            graph.shutdown();

        }
    }
}
