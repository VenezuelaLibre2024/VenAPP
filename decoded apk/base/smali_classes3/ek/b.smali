.class public final Lek/b;
.super Ldk/e;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lek/b$a;,
        Lek/b$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ldk/e<",
        "TE;>;",
        "Ljava/util/RandomAccess;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final r:Lek/b$a;

.field private static final s:Lek/b;


# instance fields
.field private a:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TE;"
        }
    .end annotation
.end field

.field private b:I

.field private c:I

.field private d:Z

.field private final e:Lek/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lek/b<",
            "TE;>;"
        }
    .end annotation
.end field

.field private final f:Lek/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lek/b<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lek/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lek/b$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lek/b;->r:Lek/b$a;

    new-instance v0, Lek/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lek/b;-><init>(I)V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lek/b;->d:Z

    sput-object v0, Lek/b;->s:Lek/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/16 v0, 0xa

    invoke-direct {p0, v0}, Lek/b;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 7

    invoke-static {p1}, Lek/c;->d(I)[Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lek/b;-><init>([Ljava/lang/Object;IIZLek/b;Lek/b;)V

    return-void
.end method

.method private constructor <init>([Ljava/lang/Object;IIZLek/b;Lek/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TE;IIZ",
            "Lek/b<",
            "TE;>;",
            "Lek/b<",
            "TE;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ldk/e;-><init>()V

    iput-object p1, p0, Lek/b;->a:[Ljava/lang/Object;

    iput p2, p0, Lek/b;->b:I

    iput p3, p0, Lek/b;->c:I

    iput-boolean p4, p0, Lek/b;->d:Z

    iput-object p5, p0, Lek/b;->e:Lek/b;

    iput-object p6, p0, Lek/b;->f:Lek/b;

    return-void
.end method

.method public static final synthetic f(Lek/b;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lek/b;->a:[Ljava/lang/Object;

    return-object p0
.end method

.method public static final synthetic k(Lek/b;)I
    .locals 0

    iget p0, p0, Lek/b;->c:I

    return p0
.end method

.method public static final synthetic l(Lek/b;)I
    .locals 0

    iget p0, p0, Lek/b;->b:I

    return p0
.end method

.method private final m(ILjava/util/Collection;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection<",
            "+TE;>;I)V"
        }
    .end annotation

    iget-object v0, p0, Lek/b;->e:Lek/b;

    if-eqz v0, :cond_0

    invoke-direct {v0, p1, p2, p3}, Lek/b;->m(ILjava/util/Collection;I)V

    iget-object p1, p0, Lek/b;->e:Lek/b;

    iget-object p1, p1, Lek/b;->a:[Ljava/lang/Object;

    iput-object p1, p0, Lek/b;->a:[Ljava/lang/Object;

    iget p1, p0, Lek/b;->c:I

    add-int/2addr p1, p3

    iput p1, p0, Lek/b;->c:I

    goto :goto_1

    :cond_0
    invoke-direct {p0, p1, p3}, Lek/b;->t(II)V

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_1

    iget-object v1, p0, Lek/b;->a:[Ljava/lang/Object;

    add-int v2, p1, v0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method private final n(ILjava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)V"
        }
    .end annotation

    iget-object v0, p0, Lek/b;->e:Lek/b;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-direct {v0, p1, p2}, Lek/b;->n(ILjava/lang/Object;)V

    iget-object p1, p0, Lek/b;->e:Lek/b;

    iget-object p1, p1, Lek/b;->a:[Ljava/lang/Object;

    iput-object p1, p0, Lek/b;->a:[Ljava/lang/Object;

    iget p1, p0, Lek/b;->c:I

    add-int/2addr p1, v1

    iput p1, p0, Lek/b;->c:I

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1, v1}, Lek/b;->t(II)V

    iget-object v0, p0, Lek/b;->a:[Ljava/lang/Object;

    aput-object p2, v0, p1

    :goto_0
    return-void
.end method

.method private final p()V
    .locals 1

    invoke-direct {p0}, Lek/b;->u()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method private final q(Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "*>;)Z"
        }
    .end annotation

    iget-object v0, p0, Lek/b;->a:[Ljava/lang/Object;

    iget v1, p0, Lek/b;->b:I

    iget v2, p0, Lek/b;->c:I

    invoke-static {v0, v1, v2, p1}, Lek/c;->a([Ljava/lang/Object;IILjava/util/List;)Z

    move-result p1

    return p1
.end method

.method private final r(I)V
    .locals 2

    iget-object v0, p0, Lek/b;->e:Lek/b;

    if-nez v0, :cond_2

    if-ltz p1, :cond_1

    iget-object v0, p0, Lek/b;->a:[Ljava/lang/Object;

    array-length v1, v0

    if-le p1, v1, :cond_0

    sget-object v1, Ldk/h;->d:Ldk/h$a;

    array-length v0, v0

    invoke-virtual {v1, v0, p1}, Ldk/h$a;->a(II)I

    move-result p1

    iget-object v0, p0, Lek/b;->a:[Ljava/lang/Object;

    invoke-static {v0, p1}, Lek/c;->e([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lek/b;->a:[Ljava/lang/Object;

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/OutOfMemoryError;

    invoke-direct {p1}, Ljava/lang/OutOfMemoryError;-><init>()V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method private final s(I)V
    .locals 1

    iget v0, p0, Lek/b;->c:I

    add-int/2addr v0, p1

    invoke-direct {p0, v0}, Lek/b;->r(I)V

    return-void
.end method

.method private final t(II)V
    .locals 3

    invoke-direct {p0, p2}, Lek/b;->s(I)V

    iget-object v0, p0, Lek/b;->a:[Ljava/lang/Object;

    iget v1, p0, Lek/b;->b:I

    iget v2, p0, Lek/b;->c:I

    add-int/2addr v1, v2

    add-int v2, p1, p2

    invoke-static {v0, v0, v2, p1, v1}, Ldk/i;->e([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    iget p1, p0, Lek/b;->c:I

    add-int/2addr p1, p2

    iput p1, p0, Lek/b;->c:I

    return-void
.end method

.method private final u()Z
    .locals 1

    iget-boolean v0, p0, Lek/b;->d:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lek/b;->f:Lek/b;

    if-eqz v0, :cond_0

    iget-boolean v0, v0, Lek/b;->d:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private final v(I)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    iget-object v0, p0, Lek/b;->e:Lek/b;

    if-eqz v0, :cond_0

    invoke-direct {v0, p1}, Lek/b;->v(I)Ljava/lang/Object;

    move-result-object p1

    iget v0, p0, Lek/b;->c:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lek/b;->c:I

    return-object p1

    :cond_0
    iget-object v0, p0, Lek/b;->a:[Ljava/lang/Object;

    aget-object v1, v0, p1

    add-int/lit8 v2, p1, 0x1

    iget v3, p0, Lek/b;->b:I

    iget v4, p0, Lek/b;->c:I

    add-int/2addr v3, v4

    invoke-static {v0, v0, p1, v2, v3}, Ldk/i;->e([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    iget-object p1, p0, Lek/b;->a:[Ljava/lang/Object;

    iget v0, p0, Lek/b;->b:I

    iget v2, p0, Lek/b;->c:I

    add-int/2addr v0, v2

    add-int/lit8 v0, v0, -0x1

    invoke-static {p1, v0}, Lek/c;->f([Ljava/lang/Object;I)V

    iget p1, p0, Lek/b;->c:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lek/b;->c:I

    return-object v1
.end method

.method private final w(II)V
    .locals 3

    iget-object v0, p0, Lek/b;->e:Lek/b;

    if-eqz v0, :cond_0

    invoke-direct {v0, p1, p2}, Lek/b;->w(II)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lek/b;->a:[Ljava/lang/Object;

    add-int v1, p1, p2

    iget v2, p0, Lek/b;->c:I

    invoke-static {v0, v0, p1, v1, v2}, Ldk/i;->e([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    iget-object p1, p0, Lek/b;->a:[Ljava/lang/Object;

    iget v0, p0, Lek/b;->c:I

    sub-int v1, v0, p2

    invoke-static {p1, v1, v0}, Lek/c;->g([Ljava/lang/Object;II)V

    :goto_0
    iget p1, p0, Lek/b;->c:I

    sub-int/2addr p1, p2

    iput p1, p0, Lek/b;->c:I

    return-void
.end method

.method private final writeReplace()Ljava/lang/Object;
    .locals 2

    invoke-direct {p0}, Lek/b;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lek/h;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lek/h;-><init>(Ljava/util/Collection;I)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/io/NotSerializableException;

    const-string v1, "The list cannot be serialized while it is being built."

    invoke-direct {v0, v1}, Ljava/io/NotSerializableException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final x(IILjava/util/Collection;Z)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/Collection<",
            "+TE;>;Z)I"
        }
    .end annotation

    iget-object v0, p0, Lek/b;->e:Lek/b;

    if-eqz v0, :cond_0

    invoke-direct {v0, p1, p2, p3, p4}, Lek/b;->x(IILjava/util/Collection;Z)I

    move-result p1

    iget p2, p0, Lek/b;->c:I

    sub-int/2addr p2, p1

    iput p2, p0, Lek/b;->c:I

    return p1

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v0, p2, :cond_2

    iget-object v2, p0, Lek/b;->a:[Ljava/lang/Object;

    add-int v3, p1, v0

    aget-object v2, v2, v3

    invoke-interface {p3, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-ne v2, p4, :cond_1

    iget-object v2, p0, Lek/b;->a:[Ljava/lang/Object;

    add-int/lit8 v4, v1, 0x1

    add-int/2addr v1, p1

    add-int/lit8 v0, v0, 0x1

    aget-object v3, v2, v3

    aput-object v3, v2, v1

    move v1, v4

    goto :goto_0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    sub-int p3, p2, v1

    iget-object p4, p0, Lek/b;->a:[Ljava/lang/Object;

    add-int/2addr p2, p1

    iget v0, p0, Lek/b;->c:I

    add-int/2addr p1, v1

    invoke-static {p4, p4, p1, p2, v0}, Ldk/i;->e([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    iget-object p1, p0, Lek/b;->a:[Ljava/lang/Object;

    iget p2, p0, Lek/b;->c:I

    sub-int p4, p2, p3

    invoke-static {p1, p4, p2}, Lek/c;->g([Ljava/lang/Object;II)V

    iget p1, p0, Lek/b;->c:I

    sub-int/2addr p1, p3

    iput p1, p0, Lek/b;->c:I

    return p3
.end method


# virtual methods
.method public add(ILjava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)V"
        }
    .end annotation

    invoke-direct {p0}, Lek/b;->p()V

    sget-object v0, Ldk/c;->a:Ldk/c$a;

    iget v1, p0, Lek/b;->c:I

    invoke-virtual {v0, p1, v1}, Ldk/c$a;->c(II)V

    iget v0, p0, Lek/b;->b:I

    add-int/2addr v0, p1

    invoke-direct {p0, v0, p2}, Lek/b;->n(ILjava/lang/Object;)V

    return-void
.end method

.method public add(Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    invoke-direct {p0}, Lek/b;->p()V

    iget v0, p0, Lek/b;->b:I

    iget v1, p0, Lek/b;->c:I

    add-int/2addr v0, v1

    invoke-direct {p0, v0, p1}, Lek/b;->n(ILjava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public addAll(ILjava/util/Collection;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection<",
            "+TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lek/b;->p()V

    sget-object v0, Ldk/c;->a:Ldk/c$a;

    iget v1, p0, Lek/b;->c:I

    invoke-virtual {v0, p1, v1}, Ldk/c$a;->c(II)V

    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v0

    iget v1, p0, Lek/b;->b:I

    add-int/2addr v1, p1

    invoke-direct {p0, v1, p2, v0}, Lek/b;->m(ILjava/util/Collection;I)V

    if-lez v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lek/b;->p()V

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    iget v1, p0, Lek/b;->b:I

    iget v2, p0, Lek/b;->c:I

    add-int/2addr v1, v2

    invoke-direct {p0, v1, p1, v0}, Lek/b;->m(ILjava/util/Collection;I)V

    if-lez v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lek/b;->c:I

    return v0
.end method

.method public clear()V
    .locals 2

    invoke-direct {p0}, Lek/b;->p()V

    iget v0, p0, Lek/b;->b:I

    iget v1, p0, Lek/b;->c:I

    invoke-direct {p0, v0, v1}, Lek/b;->w(II)V

    return-void
.end method

.method public d(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    invoke-direct {p0}, Lek/b;->p()V

    sget-object v0, Ldk/c;->a:Ldk/c$a;

    iget v1, p0, Lek/b;->c:I

    invoke-virtual {v0, p1, v1}, Ldk/c$a;->b(II)V

    iget v0, p0, Lek/b;->b:I

    add-int/2addr v0, p1

    invoke-direct {p0, v0}, Lek/b;->v(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p1, p0, :cond_1

    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/List;

    invoke-direct {p0, p1}, Lek/b;->q(Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    sget-object v0, Ldk/c;->a:Ldk/c$a;

    iget v1, p0, Lek/b;->c:I

    invoke-virtual {v0, p1, v1}, Ldk/c$a;->b(II)V

    iget-object v0, p0, Lek/b;->a:[Ljava/lang/Object;

    iget v1, p0, Lek/b;->b:I

    add-int/2addr v1, p1

    aget-object p1, v0, v1

    return-object p1
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lek/b;->a:[Ljava/lang/Object;

    iget v1, p0, Lek/b;->b:I

    iget v2, p0, Lek/b;->c:I

    invoke-static {v0, v1, v2}, Lek/c;->b([Ljava/lang/Object;II)I

    move-result v0

    return v0
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lek/b;->c:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lek/b;->a:[Ljava/lang/Object;

    iget v2, p0, Lek/b;->b:I

    add-int/2addr v2, v0

    aget-object v1, v1, v2

    invoke-static {v1, p1}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    iget v0, p0, Lek/b;->c:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TE;>;"
        }
    .end annotation

    new-instance v0, Lek/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lek/b$b;-><init>(Lek/b;I)V

    return-object v0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 3

    iget v0, p0, Lek/b;->c:I

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    iget-object v1, p0, Lek/b;->a:[Ljava/lang/Object;

    iget v2, p0, Lek/b;->b:I

    add-int/2addr v2, v0

    aget-object v1, v1, v2

    invoke-static {v1, p1}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public listIterator()Ljava/util/ListIterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ListIterator<",
            "TE;>;"
        }
    .end annotation

    new-instance v0, Lek/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lek/b$b;-><init>(Lek/b;I)V

    return-object v0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ListIterator<",
            "TE;>;"
        }
    .end annotation

    sget-object v0, Ldk/c;->a:Ldk/c$a;

    iget v1, p0, Lek/b;->c:I

    invoke-virtual {v0, p1, v1}, Ldk/c$a;->c(II)V

    new-instance v0, Lek/b$b;

    invoke-direct {v0, p0, p1}, Lek/b$b;-><init>(Lek/b;I)V

    return-object v0
.end method

.method public final o()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, Lek/b;->e:Lek/b;

    if-nez v0, :cond_1

    invoke-direct {p0}, Lek/b;->p()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lek/b;->d:Z

    iget v0, p0, Lek/b;->c:I

    if-lez v0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    sget-object v0, Lek/b;->s:Lek/b;

    :goto_0
    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 0

    invoke-direct {p0}, Lek/b;->p()V

    invoke-virtual {p0, p1}, Lek/b;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, Ldk/e;->remove(I)Ljava/lang/Object;

    :cond_0
    if-ltz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 3
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

    invoke-direct {p0}, Lek/b;->p()V

    iget v0, p0, Lek/b;->b:I

    iget v1, p0, Lek/b;->c:I

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, p1, v2}, Lek/b;->x(IILjava/util/Collection;Z)I

    move-result p1

    if-lez p1, :cond_0

    const/4 v2, 0x1

    :cond_0
    return v2
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 3
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

    invoke-direct {p0}, Lek/b;->p()V

    iget v0, p0, Lek/b;->b:I

    iget v1, p0, Lek/b;->c:I

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, p1, v2}, Lek/b;->x(IILjava/util/Collection;Z)I

    move-result p1

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method public set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)TE;"
        }
    .end annotation

    invoke-direct {p0}, Lek/b;->p()V

    sget-object v0, Ldk/c;->a:Ldk/c$a;

    iget v1, p0, Lek/b;->c:I

    invoke-virtual {v0, p1, v1}, Ldk/c$a;->b(II)V

    iget-object v0, p0, Lek/b;->a:[Ljava/lang/Object;

    iget v1, p0, Lek/b;->b:I

    add-int v2, v1, p1

    aget-object v2, v0, v2

    add-int/2addr v1, p1

    aput-object p2, v0, v1

    return-object v2
.end method

.method public subList(II)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/List<",
            "TE;>;"
        }
    .end annotation

    sget-object v0, Ldk/c;->a:Ldk/c$a;

    iget v1, p0, Lek/b;->c:I

    invoke-virtual {v0, p1, p2, v1}, Ldk/c$a;->d(III)V

    new-instance v0, Lek/b;

    iget-object v3, p0, Lek/b;->a:[Ljava/lang/Object;

    iget v1, p0, Lek/b;->b:I

    add-int v4, v1, p1

    sub-int v5, p2, p1

    iget-boolean v6, p0, Lek/b;->d:Z

    iget-object p1, p0, Lek/b;->f:Lek/b;

    if-nez p1, :cond_0

    move-object v8, p0

    goto :goto_0

    :cond_0
    move-object v8, p1

    :goto_0
    move-object v2, v0

    move-object v7, p0

    invoke-direct/range {v2 .. v8}, Lek/b;-><init>([Ljava/lang/Object;IIZLek/b;Lek/b;)V

    return-object v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lek/b;->a:[Ljava/lang/Object;

    iget v1, p0, Lek/b;->b:I

    iget v2, p0, Lek/b;->c:I

    add-int/2addr v2, v1

    invoke-static {v0, v1, v2}, Ldk/i;->i([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    const-string v0, "destination"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    iget v1, p0, Lek/b;->c:I

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lek/b;->a:[Ljava/lang/Object;

    iget v2, p0, Lek/b;->b:I

    add-int/2addr v1, v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {v0, v2, v1, p1}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p1

    const-string v0, "copyOfRange(array, offse\u2026h, destination.javaClass)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    iget-object v0, p0, Lek/b;->a:[Ljava/lang/Object;

    iget v2, p0, Lek/b;->b:I

    add-int/2addr v1, v2

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v2, v1}, Ldk/i;->e([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    array-length v0, p1

    iget v1, p0, Lek/b;->c:I

    if-le v0, v1, :cond_1

    const/4 v0, 0x0

    aput-object v0, p1, v1

    :cond_1
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lek/b;->a:[Ljava/lang/Object;

    iget v1, p0, Lek/b;->b:I

    iget v2, p0, Lek/b;->c:I

    invoke-static {v0, v1, v2}, Lek/c;->c([Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method