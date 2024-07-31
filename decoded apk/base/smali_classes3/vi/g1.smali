.class public final Lvi/g1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvi/g1$d;,
        Lvi/g1$c;,
        Lvi/g1$b;
    }
.end annotation


# static fields
.field private static final d:Z

.field private static final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lvi/g1;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Lvi/g1;

.field public static final g:Lvi/g1;

.field public static final h:Lvi/g1;

.field public static final i:Lvi/g1;

.field public static final j:Lvi/g1;

.field public static final k:Lvi/g1;

.field public static final l:Lvi/g1;

.field public static final m:Lvi/g1;

.field public static final n:Lvi/g1;

.field public static final o:Lvi/g1;

.field public static final p:Lvi/g1;

.field public static final q:Lvi/g1;

.field public static final r:Lvi/g1;

.field public static final s:Lvi/g1;

.field public static final t:Lvi/g1;

.field public static final u:Lvi/g1;

.field public static final v:Lvi/g1;

.field static final w:Lvi/w0$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvi/w0$g<",
            "Lvi/g1;",
            ">;"
        }
    .end annotation
.end field

.field private static final x:Lvi/w0$j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvi/w0$j<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field static final y:Lvi/w0$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvi/w0$g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lvi/g1$b;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "io.grpc.Status.failOnEqualsForTest"

    const-string v1, "false"

    invoke-static {v0, v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    sput-boolean v0, Lvi/g1;->d:Z

    invoke-static {}, Lvi/g1;->g()Ljava/util/List;

    move-result-object v0

    sput-object v0, Lvi/g1;->e:Ljava/util/List;

    sget-object v0, Lvi/g1$b;->OK:Lvi/g1$b;

    invoke-virtual {v0}, Lvi/g1$b;->h()Lvi/g1;

    move-result-object v0

    sput-object v0, Lvi/g1;->f:Lvi/g1;

    sget-object v0, Lvi/g1$b;->CANCELLED:Lvi/g1$b;

    invoke-virtual {v0}, Lvi/g1$b;->h()Lvi/g1;

    move-result-object v0

    sput-object v0, Lvi/g1;->g:Lvi/g1;

    sget-object v0, Lvi/g1$b;->UNKNOWN:Lvi/g1$b;

    invoke-virtual {v0}, Lvi/g1$b;->h()Lvi/g1;

    move-result-object v0

    sput-object v0, Lvi/g1;->h:Lvi/g1;

    sget-object v0, Lvi/g1$b;->INVALID_ARGUMENT:Lvi/g1$b;

    invoke-virtual {v0}, Lvi/g1$b;->h()Lvi/g1;

    move-result-object v0

    sput-object v0, Lvi/g1;->i:Lvi/g1;

    sget-object v0, Lvi/g1$b;->DEADLINE_EXCEEDED:Lvi/g1$b;

    invoke-virtual {v0}, Lvi/g1$b;->h()Lvi/g1;

    move-result-object v0

    sput-object v0, Lvi/g1;->j:Lvi/g1;

    sget-object v0, Lvi/g1$b;->NOT_FOUND:Lvi/g1$b;

    invoke-virtual {v0}, Lvi/g1$b;->h()Lvi/g1;

    move-result-object v0

    sput-object v0, Lvi/g1;->k:Lvi/g1;

    sget-object v0, Lvi/g1$b;->ALREADY_EXISTS:Lvi/g1$b;

    invoke-virtual {v0}, Lvi/g1$b;->h()Lvi/g1;

    move-result-object v0

    sput-object v0, Lvi/g1;->l:Lvi/g1;

    sget-object v0, Lvi/g1$b;->PERMISSION_DENIED:Lvi/g1$b;

    invoke-virtual {v0}, Lvi/g1$b;->h()Lvi/g1;

    move-result-object v0

    sput-object v0, Lvi/g1;->m:Lvi/g1;

    sget-object v0, Lvi/g1$b;->UNAUTHENTICATED:Lvi/g1$b;

    invoke-virtual {v0}, Lvi/g1$b;->h()Lvi/g1;

    move-result-object v0

    sput-object v0, Lvi/g1;->n:Lvi/g1;

    sget-object v0, Lvi/g1$b;->RESOURCE_EXHAUSTED:Lvi/g1$b;

    invoke-virtual {v0}, Lvi/g1$b;->h()Lvi/g1;

    move-result-object v0

    sput-object v0, Lvi/g1;->o:Lvi/g1;

    sget-object v0, Lvi/g1$b;->FAILED_PRECONDITION:Lvi/g1$b;

    invoke-virtual {v0}, Lvi/g1$b;->h()Lvi/g1;

    move-result-object v0

    sput-object v0, Lvi/g1;->p:Lvi/g1;

    sget-object v0, Lvi/g1$b;->ABORTED:Lvi/g1$b;

    invoke-virtual {v0}, Lvi/g1$b;->h()Lvi/g1;

    move-result-object v0

    sput-object v0, Lvi/g1;->q:Lvi/g1;

    sget-object v0, Lvi/g1$b;->OUT_OF_RANGE:Lvi/g1$b;

    invoke-virtual {v0}, Lvi/g1$b;->h()Lvi/g1;

    move-result-object v0

    sput-object v0, Lvi/g1;->r:Lvi/g1;

    sget-object v0, Lvi/g1$b;->UNIMPLEMENTED:Lvi/g1$b;

    invoke-virtual {v0}, Lvi/g1$b;->h()Lvi/g1;

    move-result-object v0

    sput-object v0, Lvi/g1;->s:Lvi/g1;

    sget-object v0, Lvi/g1$b;->INTERNAL:Lvi/g1$b;

    invoke-virtual {v0}, Lvi/g1$b;->h()Lvi/g1;

    move-result-object v0

    sput-object v0, Lvi/g1;->t:Lvi/g1;

    sget-object v0, Lvi/g1$b;->UNAVAILABLE:Lvi/g1$b;

    invoke-virtual {v0}, Lvi/g1$b;->h()Lvi/g1;

    move-result-object v0

    sput-object v0, Lvi/g1;->u:Lvi/g1;

    sget-object v0, Lvi/g1$b;->DATA_LOSS:Lvi/g1$b;

    invoke-virtual {v0}, Lvi/g1$b;->h()Lvi/g1;

    move-result-object v0

    sput-object v0, Lvi/g1;->v:Lvi/g1;

    new-instance v0, Lvi/g1$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lvi/g1$c;-><init>(Lvi/g1$a;)V

    const-string v2, "grpc-status"

    const/4 v3, 0x0

    invoke-static {v2, v3, v0}, Lvi/w0$g;->g(Ljava/lang/String;ZLvi/w0$j;)Lvi/w0$g;

    move-result-object v0

    sput-object v0, Lvi/g1;->w:Lvi/w0$g;

    new-instance v0, Lvi/g1$d;

    invoke-direct {v0, v1}, Lvi/g1$d;-><init>(Lvi/g1$a;)V

    sput-object v0, Lvi/g1;->x:Lvi/w0$j;

    const-string v1, "grpc-message"

    invoke-static {v1, v3, v0}, Lvi/w0$g;->g(Ljava/lang/String;ZLvi/w0$j;)Lvi/w0$g;

    move-result-object v0

    sput-object v0, Lvi/g1;->y:Lvi/w0$g;

    return-void
.end method

.method private constructor <init>(Lvi/g1$b;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, v0}, Lvi/g1;-><init>(Lvi/g1$b;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method private constructor <init>(Lvi/g1$b;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "code"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/g1$b;

    iput-object p1, p0, Lvi/g1;->a:Lvi/g1$b;

    iput-object p2, p0, Lvi/g1;->b:Ljava/lang/String;

    iput-object p3, p0, Lvi/g1;->c:Ljava/lang/Throwable;

    return-void
.end method

.method static synthetic a()Ljava/util/List;
    .locals 1

    sget-object v0, Lvi/g1;->e:Ljava/util/List;

    return-object v0
.end method

.method static synthetic b([B)Lvi/g1;
    .locals 0

    invoke-static {p0}, Lvi/g1;->j([B)Lvi/g1;

    move-result-object p0

    return-object p0
.end method

.method private static g()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lvi/g1;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    invoke-static {}, Lvi/g1$b;->values()[Lvi/g1$b;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Lvi/g1$b;->i()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    new-instance v6, Lvi/g1;

    invoke-direct {v6, v4}, Lvi/g1;-><init>(Lvi/g1$b;)V

    invoke-virtual {v0, v5, v6}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lvi/g1;

    if-nez v5, :cond_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Code value duplication between "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Lvi/g1;->n()Lvi/g1$b;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " & "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static h(Lvi/g1;)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lvi/g1;->b:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object p0, p0, Lvi/g1;->a:Lvi/g1$b;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lvi/g1;->a:Lvi/g1$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lvi/g1;->b:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static i(I)Lvi/g1;
    .locals 3

    if-ltz p0, :cond_1

    sget-object v0, Lvi/g1;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-le p0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lvi/g1;

    return-object p0

    :cond_1
    :goto_0
    sget-object v0, Lvi/g1;->h:Lvi/g1;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown code "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object p0

    return-object p0
.end method

.method private static j([B)Lvi/g1;
    .locals 2

    array-length v0, p0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    aget-byte v0, p0, v0

    const/16 v1, 0x30

    if-ne v0, v1, :cond_0

    sget-object p0, Lvi/g1;->f:Lvi/g1;

    return-object p0

    :cond_0
    invoke-static {p0}, Lvi/g1;->k([B)Lvi/g1;

    move-result-object p0

    return-object p0
.end method

.method private static k([B)Lvi/g1;
    .locals 6

    array-length v0, p0

    const/16 v1, 0x39

    const/4 v2, 0x1

    const/16 v3, 0x30

    const/4 v4, 0x0

    if-eq v0, v2, :cond_2

    const/4 v5, 0x2

    if-eq v0, v5, :cond_0

    goto :goto_1

    :cond_0
    aget-byte v0, p0, v4

    if-lt v0, v3, :cond_4

    if-le v0, v1, :cond_1

    goto :goto_1

    :cond_1
    sub-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0xa

    add-int/2addr v4, v0

    goto :goto_0

    :cond_2
    move v2, v4

    :goto_0
    aget-byte v0, p0, v2

    if-lt v0, v3, :cond_4

    if-le v0, v1, :cond_3

    goto :goto_1

    :cond_3
    sub-int/2addr v0, v3

    add-int/2addr v4, v0

    sget-object v0, Lvi/g1;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-ge v4, v1, :cond_4

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lvi/g1;

    return-object p0

    :cond_4
    :goto_1
    sget-object v0, Lvi/g1;->h:Lvi/g1;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown code "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Ljava/lang/String;

    sget-object v3, Leb/e;->a:Ljava/nio/charset/Charset;

    invoke-direct {v2, p0, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object p0

    return-object p0
.end method

.method public static l(Ljava/lang/Throwable;)Lvi/g1;
    .locals 2

    const-string v0, "t"

    invoke-static {p0, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    :goto_0
    if-eqz v0, :cond_2

    instance-of v1, v0, Lvi/h1;

    if-eqz v1, :cond_0

    check-cast v0, Lvi/h1;

    invoke-virtual {v0}, Lvi/h1;->a()Lvi/g1;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v1, v0, Lvi/i1;

    if-eqz v1, :cond_1

    check-cast v0, Lvi/i1;

    invoke-virtual {v0}, Lvi/i1;->a()Lvi/g1;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_0

    :cond_2
    sget-object v0, Lvi/g1;->h:Lvi/g1;

    invoke-virtual {v0, p0}, Lvi/g1;->q(Ljava/lang/Throwable;)Lvi/g1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public c()Lvi/h1;
    .locals 1

    new-instance v0, Lvi/h1;

    invoke-direct {v0, p0}, Lvi/h1;-><init>(Lvi/g1;)V

    return-object v0
.end method

.method public d()Lvi/i1;
    .locals 1

    new-instance v0, Lvi/i1;

    invoke-direct {v0, p0}, Lvi/i1;-><init>(Lvi/g1;)V

    return-object v0
.end method

.method public e(Lvi/w0;)Lvi/i1;
    .locals 1

    new-instance v0, Lvi/i1;

    invoke-direct {v0, p0, p1}, Lvi/i1;-><init>(Lvi/g1;Lvi/w0;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f(Ljava/lang/String;)Lvi/g1;
    .locals 4

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Lvi/g1;->b:Ljava/lang/String;

    if-nez v0, :cond_1

    new-instance v0, Lvi/g1;

    iget-object v1, p0, Lvi/g1;->a:Lvi/g1$b;

    iget-object v2, p0, Lvi/g1;->c:Ljava/lang/Throwable;

    invoke-direct {v0, v1, p1, v2}, Lvi/g1;-><init>(Lvi/g1$b;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0

    :cond_1
    new-instance v0, Lvi/g1;

    iget-object v1, p0, Lvi/g1;->a:Lvi/g1$b;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lvi/g1;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Lvi/g1;->c:Ljava/lang/Throwable;

    invoke-direct {v0, v1, p1, v2}, Lvi/g1;-><init>(Lvi/g1$b;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public m()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lvi/g1;->c:Ljava/lang/Throwable;

    return-object v0
.end method

.method public n()Lvi/g1$b;
    .locals 1

    iget-object v0, p0, Lvi/g1;->a:Lvi/g1$b;

    return-object v0
.end method

.method public o()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lvi/g1;->b:Ljava/lang/String;

    return-object v0
.end method

.method public p()Z
    .locals 2

    sget-object v0, Lvi/g1$b;->OK:Lvi/g1$b;

    iget-object v1, p0, Lvi/g1;->a:Lvi/g1$b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public q(Ljava/lang/Throwable;)Lvi/g1;
    .locals 3

    iget-object v0, p0, Lvi/g1;->c:Ljava/lang/Throwable;

    invoke-static {v0, p1}, Leb/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lvi/g1;

    iget-object v1, p0, Lvi/g1;->a:Lvi/g1$b;

    iget-object v2, p0, Lvi/g1;->b:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p1}, Lvi/g1;-><init>(Lvi/g1$b;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public r(Ljava/lang/String;)Lvi/g1;
    .locals 3

    iget-object v0, p0, Lvi/g1;->b:Ljava/lang/String;

    invoke-static {v0, p1}, Leb/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lvi/g1;

    iget-object v1, p0, Lvi/g1;->a:Lvi/g1$b;

    iget-object v2, p0, Lvi/g1;->c:Ljava/lang/Throwable;

    invoke-direct {v0, v1, p1, v2}, Lvi/g1;-><init>(Lvi/g1$b;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Leb/i;->c(Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    iget-object v1, p0, Lvi/g1;->a:Lvi/g1$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    const-string v2, "code"

    invoke-virtual {v0, v2, v1}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "description"

    iget-object v2, p0, Lvi/g1;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    iget-object v1, p0, Lvi/g1;->c:Ljava/lang/Throwable;

    if-eqz v1, :cond_0

    invoke-static {v1}, Leb/y;->e(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    :cond_0
    const-string v2, "cause"

    invoke-virtual {v0, v2, v1}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    invoke-virtual {v0}, Leb/i$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
