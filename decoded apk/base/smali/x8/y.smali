.class public Lx8/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx8/y$b;,
        Lx8/y$a;
    }
.end annotation


# static fields
.field public static final f:Ljava/util/List;


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Ljava/lang/String;

.field private final d:Ljava/util/List;

.field private final e:Lx8/y$b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "PG"

    const-string v1, "G"

    const-string v2, "MA"

    const-string v3, "T"

    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lx8/y;->f:Ljava/util/List;

    return-void
.end method

.method synthetic constructor <init>(IILjava/lang/String;Ljava/util/List;Lx8/y$b;Lx8/k0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lx8/y;->a:I

    iput p2, p0, Lx8/y;->b:I

    iput-object p3, p0, Lx8/y;->c:Ljava/lang/String;

    iput-object p4, p0, Lx8/y;->d:Ljava/util/List;

    iput-object p5, p0, Lx8/y;->e:Lx8/y$b;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx8/y;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    return-object v0
.end method

.method public b()Lx8/y$b;
    .locals 1

    iget-object v0, p0, Lx8/y;->e:Lx8/y$b;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lx8/y;->a:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lx8/y;->b:I

    return v0
.end method

.method public e()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lx8/y;->d:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public f()Lx8/y$a;
    .locals 2

    new-instance v0, Lx8/y$a;

    invoke-direct {v0}, Lx8/y$a;-><init>()V

    iget v1, p0, Lx8/y;->a:I

    invoke-virtual {v0, v1}, Lx8/y$a;->c(I)Lx8/y$a;

    iget v1, p0, Lx8/y;->b:I

    invoke-virtual {v0, v1}, Lx8/y$a;->d(I)Lx8/y$a;

    iget-object v1, p0, Lx8/y;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lx8/y$a;->b(Ljava/lang/String;)Lx8/y$a;

    iget-object v1, p0, Lx8/y;->d:Ljava/util/List;

    invoke-virtual {v0, v1}, Lx8/y$a;->e(Ljava/util/List;)Lx8/y$a;

    return-object v0
.end method
