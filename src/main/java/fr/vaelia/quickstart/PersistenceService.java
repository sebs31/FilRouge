package fr.vaelia.quickstart;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import fr.vaelia.model.Conceptor;
import fr.vaelia.model.PropositionMCQ;
import fr.vaelia.model.Question;
import fr.vaelia.model.Question.QuestionType;
import fr.vaelia.model.Questionnaire;

/**
 * PersistenceService
 */
@ApplicationScoped
public class PersistenceService {

    @Inject
    EntityManager em;

    public Questionnaire createEntities() {
        
        // Questionnaire quest = new Questionnaire("Mon questionnaire");
        // quest.setConceptor(new Conceptor("Concepteur"));
        // for (int i = 1; i < 10; i++) {
        //     Question q=new Question(String.format("Statement n° %d", i), i, QuestionType.MCQ);
        //     for (int j = 1; j < 5; j++) {
        //         PropositionMCQ p = new PropositionMCQ(String.format("Statement n° %d%d", i,j), i%j == 0);
        //         q.addProposition(p);
        //     }
        //     quest.addQuestion(q);
        // }
        return null;
    }

    @Transactional
    public void injectEntities(Questionnaire q) {
        em.persist(q.getConceptor());
        em.persist(q);
    }
}