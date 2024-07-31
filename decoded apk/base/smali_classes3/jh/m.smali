.class public Ljh/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lih/p;

.field private b:I

.field private c:Z

.field private d:Ljh/q;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ILih/p;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ljh/m;->c:Z

    new-instance v0, Ljh/n;

    invoke-direct {v0}, Ljh/n;-><init>()V

    iput-object v0, p0, Ljh/m;->d:Ljh/q;

    iput p1, p0, Ljh/m;->b:I

    iput-object p2, p0, Ljh/m;->a:Lih/p;

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;Z)Lih/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lih/p;",
            ">;Z)",
            "Lih/p;"
        }
    .end annotation

    invoke-virtual {p0, p2}, Ljh/m;->b(Z)Lih/p;

    move-result-object p2

    iget-object v0, p0, Ljh/m;->d:Ljh/q;

    invoke-virtual {v0, p1, p2}, Ljh/q;->b(Ljava/util/List;Lih/p;)Lih/p;

    move-result-object p1

    return-object p1
.end method

.method public b(Z)Lih/p;
    .locals 1

    iget-object v0, p0, Ljh/m;->a:Lih/p;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {v0}, Lih/p;->h()Lih/p;

    move-result-object p1

    return-object p1

    :cond_1
    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Ljh/m;->b:I

    return v0
.end method

.method public d(Lih/p;)Landroid/graphics/Rect;
    .locals 2

    iget-object v0, p0, Ljh/m;->d:Ljh/q;

    iget-object v1, p0, Ljh/m;->a:Lih/p;

    invoke-virtual {v0, p1, v1}, Ljh/q;->d(Lih/p;Lih/p;)Landroid/graphics/Rect;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljh/q;)V
    .locals 0

    iput-object p1, p0, Ljh/m;->d:Ljh/q;

    return-void
.end method
