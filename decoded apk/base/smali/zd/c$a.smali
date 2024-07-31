.class Lzd/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldj/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzd/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldj/h<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lzd/c;


# direct methods
.method constructor <init>(Lzd/c;)V
    .locals 0

    iput-object p1, p0, Lzd/c$a;->a:Lzd/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ldj/g;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/g<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "Subscribing to analytics events."

    invoke-static {v0}, Lzd/l2;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lzd/c$a;->a:Lzd/c;

    invoke-static {v0}, Lzd/c;->b(Lzd/c;)Lcc/a;

    move-result-object v1

    new-instance v2, Lzd/i0;

    invoke-direct {v2, p1}, Lzd/i0;-><init>(Ldj/g;)V

    const-string p1, "fiam"

    invoke-interface {v1, p1, v2}, Lcc/a;->b(Ljava/lang/String;Lcc/a$b;)Lcc/a$a;

    move-result-object p1

    invoke-static {v0, p1}, Lzd/c;->a(Lzd/c;Lcc/a$a;)Lcc/a$a;

    return-void
.end method
