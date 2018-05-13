package com.cp.test;

import java.util.Date;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cp.entities.Resourceallocation;
import com.cp.entities.Resourceid;
import com.cp.util.SessionFactoryregistry;
import com.cp.entities.Resourceallocation;

public class CPTest {



	public static void main(String[] args) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
		  SessionFactory sessionfactory=null;
		     Transaction transaction=null;
		     Session session=null;
		     boolean flag=false;
		     try{
		    	 System.out.println("haiii");
		    	 sessionfactory=SessionFactoryregistry.getSessionfactory();
		    	
		    	 session=sessionfactory.openSession();
		    	 //transaction= session.beginTransaction();
		    	 Resourceid id=new Resourceid();
		    	 id.setResourceno(10);
		    	 id.setProjectno(10);
		    	/* Resourceallocation ra=new Resourceallocation();//insert
		    	  ra.setId(id);
		    	  ra.setResourseno(10);
		    	  ra.setProjectno(10);
		    	 ra.setResourcestartdate(new Date());
		    	 ra.setRole("lead");
		    	 ra.setProjectpercentage(100);
		    	 session.save(ra);
		    	 flag=true;*/
		    	 Resourceallocation ra=(Resourceallocation) session.get(Resourceallocation.class, id);
                   System.out.println(ra);		    	 
		    	 
		     }finally{
		    	 if(transaction!=null){
		    		 if(flag){
		    			 transaction.commit();
		    		 }else{
		    			 transaction.rollback();
		    		 }
		    	 }
		     }
		     sessionfactory.close();
			}


	}


