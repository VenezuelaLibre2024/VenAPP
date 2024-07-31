.class public final Lek/j;
.super Ldk/f;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lek/j$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ldk/f<",
        "TE;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final b:Lek/j$a;

.field private static final c:Lek/j;


# instance fields
.field private final a:Lek/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lek/d<",
            "TE;*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lek/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lek/j$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lek/j;->b:Lek/j$a;

    new-instance v0, Lek/j;

    sget-object v1, Lek/d;->x:Lek/d$a;

    invoke-virtual {v1}, Lek/d$a;->e()Lek/d;

    move-result-object v1

    invoke-direct {v0, v1}, Lek/j;-><init>(Lek/d;)V

    sput-object v0, Lek/j;->c:Lek/j;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, Lek/d;

    invoke-direct {v0}, Lek/d;-><init>()V

    invoke-direct {p0, v0}, Lek/j;-><init>(Lek/d;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    new-instance v0, Lek/d;

    invoke-direct {v0, p1}, Lek/d;-><init>(I)V

    invoke-direct {p0, v0}, Lek/j;-><init>(Lek/d;)V

    return-void
.end method

.method public constructor <init>(Lek/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lek/d<",
            "TE;*>;)V"
        }
    .end annotation

    const-string v0, "backing"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ldk/f;-><init>()V

    iput-object p1, p0, Lek/j;->a:Lek/d;

    return-void
.end method

.method private final writeReplace()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lek/j;->a:Lek/d;

    invoke-virtual {v0}, Lek/d;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lek/h;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lek/h;-><init>(Ljava/util/Collection;I)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/io/NotSerializableException;

    const-string v1, "The set cannot be serialized while it is being built."

    invoke-direct {v0, v1}, Ljava/io/NotSerializableException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    iget-object v0, p0, Lek/j;->a:Lek/d;

    invoke-virtual {v0, p1}, Lek/d;->i(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lek/j;->a:Lek/d;

    invoke-virtual {v0}, Lek/d;->l()V

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lek/j;->a:Lek/d;

    invoke-virtual {v0}, Lek/d;->size()I

    move-result v0

    return v0
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, Lek/j;->a:Lek/d;

    invoke-virtual {v0}, Lek/d;->clear()V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lek/j;->a:Lek/d;

    invoke-virtual {v0, p1}, Lek/d;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final d()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, Lek/j;->a:Lek/d;

    invoke-virtual {v0}, Lek/d;->k()Ljava/util/Map;

    invoke-virtual {p0}, Ldk/f;->size()I

    move-result v0

    if-lez v0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    sget-object v0, Lek/j;->c:Lek/j;

    :goto_0
    return-object v0
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lek/j;->a:Lek/d;

    invoke-virtual {v0}, Lek/d;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, Lek/j;->a:Lek/d;

    invoke-virtual {v0}, Lek/d;->D()Lek/d$e;

    move-result-object v0

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lek/j;->a:Lek/d;

    invoke-virtual {v0, p1}, Lek/d;->K(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lek/j;->a:Lek/d;

    invoke-virtual {v0}, Lek/d;->l()V

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lek/j;->a:Lek/d;

    invoke-virtual {v0}, Lek/d;->l()V

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->retainAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method
