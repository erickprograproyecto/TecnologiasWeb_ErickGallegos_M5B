package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Empleado;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2022-07-22T19:46:36")
@StaticMetamodel(Departamento.class)
public class Departamento_ { 

    public static volatile SingularAttribute<Departamento, Integer> idDep;
    public static volatile CollectionAttribute<Departamento, Empleado> empleadoCollection;
    public static volatile SingularAttribute<Departamento, String> nombre;

}