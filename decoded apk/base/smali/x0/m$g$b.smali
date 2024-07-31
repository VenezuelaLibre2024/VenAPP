.class public final Lx0/m$g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcl/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx0/m$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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


# direct methods
.method public constructor <init>(Lcl/b;)V
    .locals 0

    iput-object p1, p0, Lx0/m$g$b;->a:Lcl/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcl/c;Lgk/Continuation;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lx0/m$g$b;->a:Lcl/b;

    new-instance v1, Lx0/m$g$b$a;

    invoke-direct {v1, p1}, Lx0/m$g$b$a;-><init>(Lcl/c;)V

    invoke-interface {v0, v1, p2}, Lcl/b;->a(Lcl/c;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method
