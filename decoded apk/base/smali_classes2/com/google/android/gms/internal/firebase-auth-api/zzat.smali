.class public abstract Lcom/google/android/gms/internal/firebase-auth-api/zzat;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/util/Map;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;",
        "Ljava/util/Map<",
        "TK;TV;>;"
    }
.end annotation


# static fields
.field private static final zza:[Ljava/util/Map$Entry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/util/Map$Entry<",
            "**>;"
        }
    .end annotation
.end field


# instance fields
.field private transient zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzau;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzau<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation
.end field

.field private transient zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzau;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzau<",
            "TK;>;"
        }
    .end annotation
.end field

.field private transient zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzak;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzak<",
            "TV;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/util/Map$Entry;

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzat;->zza:[Ljava/util/Map$Entry;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static zza(Ljava/util/Map;)Lcom/google/android/gms/internal/firebase-auth-api/zzat;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "+TK;+TV;>;)",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzat<",
            "TK;TV;>;"
        }
    .end annotation

    instance-of v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzat;

    if-eqz v0, :cond_0

    instance-of v0, p0, Ljava/util/SortedMap;

    if-nez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/zzat;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzat;->zzd()Z

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x4

    :goto_0
    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzas;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzas;-><init>(I)V

    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzas;->zza(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/firebase-auth-api/zzas;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzas;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzat;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final clear()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzat;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzat;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzak;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzak;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public synthetic entrySet()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzat;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzau;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzat;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzau;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzat;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzau;

    :cond_0
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Ljava/util/Map;

    if-eqz v0, :cond_1

    check-cast p1, Ljava/util/Map;

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public abstract get(Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation
.end method

.method public final getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "TV;)TV;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzat;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    return-object p2
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzat;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzau;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzbd;->zza(Ljava/util/Set;)I

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public synthetic keySet()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzat;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzau;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzat;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzau;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzat;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzau;

    :cond_0
    return-object v0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "+TK;+TV;>;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v0

    const-string v1, "size"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzai;->zza(ILjava/lang/String;)I

    new-instance v1, Ljava/lang/StringBuilder;

    int-to-long v2, v0

    const/4 v0, 0x3

    shl-long/2addr v2, v0

    const-wide/32 v4, 0x40000000

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v0, v2

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v0, 0x7b

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    if-nez v2, :cond_0

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0x3d

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    const/16 v0, 0x7d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public synthetic values()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzat;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzak;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzat;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzak;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzat;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzak;

    :cond_0
    return-object v0
.end method

.method abstract zza()Lcom/google/android/gms/internal/firebase-auth-api/zzak;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzak<",
            "TV;>;"
        }
    .end annotation
.end method

.method abstract zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzau;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzau<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation
.end method

.method abstract zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzau;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzau<",
            "TK;>;"
        }
    .end annotation
.end method

.method abstract zzd()Z
.end method
