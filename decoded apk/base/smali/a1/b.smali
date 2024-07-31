.class public final La1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lx0/f<",
        "La1/d;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lx0/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx0/f<",
            "La1/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lx0/f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/f<",
            "La1/d;",
            ">;)V"
        }
    .end annotation

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La1/b;->a:Lx0/f;

    return-void
.end method


# virtual methods
.method public a(Lok/p;Lgk/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lok/p<",
            "-",
            "La1/d;",
            "-",
            "Lgk/Continuation<",
            "-",
            "La1/d;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lgk/Continuation<",
            "-",
            "La1/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, La1/b;->a:Lx0/f;

    new-instance v1, La1/b$a;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, La1/b$a;-><init>(Lok/p;Lgk/Continuation;)V

    invoke-interface {v0, v1, p2}, Lx0/f;->a(Lok/p;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getData()Lcl/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcl/b<",
            "La1/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, La1/b;->a:Lx0/f;

    invoke-interface {v0}, Lx0/f;->getData()Lcl/b;

    move-result-object v0

    return-object v0
.end method
