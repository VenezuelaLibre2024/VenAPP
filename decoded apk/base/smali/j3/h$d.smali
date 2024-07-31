.class Lj3/h$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj3/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Z:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private a:Lh3/f;

.field private b:Lh3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh3/k<",
            "TZ;>;"
        }
    .end annotation
.end field

.field private c:Lj3/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj3/u<",
            "TZ;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lj3/h$d;->a:Lh3/f;

    iput-object v0, p0, Lj3/h$d;->b:Lh3/k;

    iput-object v0, p0, Lj3/h$d;->c:Lj3/u;

    return-void
.end method

.method b(Lj3/h$e;Lh3/h;)V
    .locals 4

    const-string v0, "DecodeJob.encode"

    invoke-static {v0}, Ld4/b;->a(Ljava/lang/String;)V

    :try_start_0
    invoke-interface {p1}, Lj3/h$e;->a()Ll3/a;

    move-result-object p1

    iget-object v0, p0, Lj3/h$d;->a:Lh3/f;

    new-instance v1, Lj3/e;

    iget-object v2, p0, Lj3/h$d;->b:Lh3/k;

    iget-object v3, p0, Lj3/h$d;->c:Lj3/u;

    invoke-direct {v1, v2, v3, p2}, Lj3/e;-><init>(Lh3/d;Ljava/lang/Object;Lh3/h;)V

    invoke-interface {p1, v0, v1}, Ll3/a;->a(Lh3/f;Ll3/a$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lj3/h$d;->c:Lj3/u;

    invoke-virtual {p1}, Lj3/u;->d()V

    invoke-static {}, Ld4/b;->e()V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lj3/h$d;->c:Lj3/u;

    invoke-virtual {p2}, Lj3/u;->d()V

    invoke-static {}, Ld4/b;->e()V

    throw p1
.end method

.method c()Z
    .locals 1

    iget-object v0, p0, Lj3/h$d;->c:Lj3/u;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method d(Lh3/f;Lh3/k;Lj3/u;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<X:",
            "Ljava/lang/Object;",
            ">(",
            "Lh3/f;",
            "Lh3/k<",
            "TX;>;",
            "Lj3/u<",
            "TX;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lj3/h$d;->a:Lh3/f;

    iput-object p2, p0, Lj3/h$d;->b:Lh3/k;

    iput-object p3, p0, Lj3/h$d;->c:Lj3/u;

    return-void
.end method
