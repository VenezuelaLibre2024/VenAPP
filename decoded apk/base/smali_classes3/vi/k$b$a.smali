.class public final Lvi/k$b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvi/k$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Lvi/c;

.field private b:I

.field private c:Z


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lvi/c;->k:Lvi/c;

    iput-object v0, p0, Lvi/k$b$a;->a:Lvi/c;

    return-void
.end method


# virtual methods
.method public a()Lvi/k$b;
    .locals 4

    new-instance v0, Lvi/k$b;

    iget-object v1, p0, Lvi/k$b$a;->a:Lvi/c;

    iget v2, p0, Lvi/k$b$a;->b:I

    iget-boolean v3, p0, Lvi/k$b$a;->c:Z

    invoke-direct {v0, v1, v2, v3}, Lvi/k$b;-><init>(Lvi/c;IZ)V

    return-object v0
.end method

.method public b(Lvi/c;)Lvi/k$b$a;
    .locals 1

    const-string v0, "callOptions cannot be null"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/c;

    iput-object p1, p0, Lvi/k$b$a;->a:Lvi/c;

    return-object p0
.end method

.method public c(Z)Lvi/k$b$a;
    .locals 0

    iput-boolean p1, p0, Lvi/k$b$a;->c:Z

    return-object p0
.end method

.method public d(I)Lvi/k$b$a;
    .locals 0

    iput p1, p0, Lvi/k$b$a;->b:I

    return-object p0
.end method
