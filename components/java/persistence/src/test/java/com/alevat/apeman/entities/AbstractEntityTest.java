package com.alevat.apeman.entities;

import org.junit.Test;

import java.util.UUID;

import static java.util.UUID.randomUUID;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class AbstractEntityTest {

    private TestEntity entity = new TestEntity();

    @Test
    public void equals_ShouldFailForNull() {
        assertThat(entity.equals(null), is(false));
    }

    @Test
    public void equals_ShouldFailForDifferentUuid() {
        entity.setUuid(randomUUID());
        TestEntity entity2 = new TestEntity();
        entity2.setUuid(randomUUID());
        assertThat(entity.equals(entity2), is(false));
    }

    @Test
    public void equals_ShouldFailForDifferentClass() {
        TestEntity entity2 = new TestEntity() {};
        assertThat(entity.equals(entity2), is(false));
    }

    @Test
    public void equals_ShouldPassForSameUuid() {
        UUID uuid = randomUUID();
        entity.setUuid(uuid);
        TestEntity entity2 = new TestEntity();
        entity2.setUuid(uuid);
        assertThat(entity.equals(entity2), is(true));
    }

    @Test
    public void equals_ShouldPassForSameObject() {
        assertThat(entity.equals(entity), is(true));
    }

    @Test
    public void hashCode_ShouldBeEqualForNullUuids() {
        TestEntity entity2 = new TestEntity();
        assertThat(entity.hashCode(), is(entity2.hashCode()));
    }

    @Test
    public void hashCode_ShouldBeEqualForSameUuids() {
        UUID uuid = randomUUID();
        TestEntity entity2 = new TestEntity();
        entity.setUuid(uuid);
        entity2.setUuid(uuid);
        assertThat(entity.hashCode(), is(entity2.hashCode()));
    }

    @Test
    public void toString_ShouldIncludeUuid() {
        UUID uuid = randomUUID();
        entity.setUuid(uuid);
        assertThat(entity.toString(), containsString(uuid.toString()));
    }

    @Test
    public void toString_ShouldIncludeClassname() {
        assertThat(entity.toString(), containsString("TestEntity"));
    }

    private static class TestEntity extends AbstractEntity {

        private UUID uuid;

        @Override
        public UUID getUuid() {
            return uuid;
        }

        @Override
        public void setUuid(UUID uuid) {
            this.uuid = uuid;
        }
    }

}