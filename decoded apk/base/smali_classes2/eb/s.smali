.class public final Leb/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Leb/s$b;,
        Leb/s$c;
    }
.end annotation


# instance fields
.field private final a:Leb/d;

.field private final b:Z

.field private final c:Leb/s$c;

.field private final d:I


# direct methods
.method private constructor <init>(Leb/s$c;)V
    .locals 3

    invoke-static {}, Leb/d;->f()Leb/d;

    move-result-object v0

    const v1, 0x7fffffff

    const/4 v2, 0x0

    invoke-direct {p0, p1, v2, v0, v1}, Leb/s;-><init>(Leb/s$c;ZLeb/d;I)V

    return-void
.end method

.method private constructor <init>(Leb/s$c;ZLeb/d;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leb/s;->c:Leb/s$c;

    iput-boolean p2, p0, Leb/s;->b:Z

    iput-object p3, p0, Leb/s;->a:Leb/d;

    iput p4, p0, Leb/s;->d:I

    return-void
.end method

.method static synthetic a(Leb/s;)Leb/d;
    .locals 0

    iget-object p0, p0, Leb/s;->a:Leb/d;

    return-object p0
.end method

.method static synthetic b(Leb/s;)Z
    .locals 0

    iget-boolean p0, p0, Leb/s;->b:Z

    return p0
.end method

.method static synthetic c(Leb/s;)I
    .locals 0

    iget p0, p0, Leb/s;->d:I

    return p0
.end method

.method public static d(C)Leb/s;
    .locals 0

    invoke-static {p0}, Leb/d;->d(C)Leb/d;

    move-result-object p0

    invoke-static {p0}, Leb/s;->e(Leb/d;)Leb/s;

    move-result-object p0

    return-object p0
.end method

.method public static e(Leb/d;)Leb/s;
    .locals 2

    invoke-static {p0}, Leb/o;->o(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Leb/s;

    new-instance v1, Leb/s$a;

    invoke-direct {v1, p0}, Leb/s$a;-><init>(Leb/d;)V

    invoke-direct {v0, v1}, Leb/s;-><init>(Leb/s$c;)V

    return-object v0
.end method

.method private g(Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            ")",
            "Ljava/util/Iterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Leb/s;->c:Leb/s$c;

    invoke-interface {v0, p0, p1}, Leb/s$c;->a(Leb/s;Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public f(Ljava/lang/CharSequence;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Leb/o;->o(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0, p1}, Leb/s;->g(Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public h()Leb/s;
    .locals 1

    invoke-static {}, Leb/d;->h()Leb/d;

    move-result-object v0

    invoke-virtual {p0, v0}, Leb/s;->i(Leb/d;)Leb/s;

    move-result-object v0

    return-object v0
.end method

.method public i(Leb/d;)Leb/s;
    .locals 4

    invoke-static {p1}, Leb/o;->o(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Leb/s;

    iget-object v1, p0, Leb/s;->c:Leb/s$c;

    iget-boolean v2, p0, Leb/s;->b:Z

    iget v3, p0, Leb/s;->d:I

    invoke-direct {v0, v1, v2, p1, v3}, Leb/s;-><init>(Leb/s$c;ZLeb/d;I)V

    return-object v0
.end method
