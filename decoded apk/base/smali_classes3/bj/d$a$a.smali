.class Lbj/d$a$a;
.super Lvi/p0$i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbj/d$a;->c(Lvi/g1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lvi/g1;

.field final synthetic b:Lbj/d$a;


# direct methods
.method constructor <init>(Lbj/d$a;Lvi/g1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lbj/d$a$a;->b:Lbj/d$a;

    iput-object p2, p0, Lbj/d$a$a;->a:Lvi/g1;

    invoke-direct {p0}, Lvi/p0$i;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lvi/p0$f;)Lvi/p0$e;
    .locals 0

    iget-object p1, p0, Lbj/d$a$a;->a:Lvi/g1;

    invoke-static {p1}, Lvi/p0$e;->f(Lvi/g1;)Lvi/p0$e;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const-class v0, Lbj/d$a$a;

    invoke-static {v0}, Leb/i;->b(Ljava/lang/Class;)Leb/i$b;

    move-result-object v0

    const-string v1, "error"

    iget-object v2, p0, Lbj/d$a$a;->a:Lvi/g1;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    invoke-virtual {v0}, Leb/i$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
