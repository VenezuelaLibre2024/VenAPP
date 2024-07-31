.class public final Lcl/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcl/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcl/i;->a(Lcl/b;Lok/p;)Lcl/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcl/b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcl/b;

.field final synthetic b:Lok/p;


# direct methods
.method public constructor <init>(Lcl/b;Lok/p;)V
    .locals 0

    iput-object p1, p0, Lcl/i$a;->a:Lcl/b;

    iput-object p2, p0, Lcl/i$a;->b:Lok/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcl/c;Lgk/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcl/c<",
            "-TT;>;",
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lkotlin/jvm/internal/v;

    invoke-direct {v0}, Lkotlin/jvm/internal/v;-><init>()V

    iget-object v1, p0, Lcl/i$a;->a:Lcl/b;

    new-instance v2, Lcl/i$b;

    iget-object v3, p0, Lcl/i$a;->b:Lok/p;

    invoke-direct {v2, v0, p1, v3}, Lcl/i$b;-><init>(Lkotlin/jvm/internal/v;Lcl/c;Lok/p;)V

    invoke-interface {v1, v2, p2}, Lcl/b;->a(Lcl/c;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method
