.class public final Ldf/x$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcl/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldf/x;-><init>(Landroid/content/Context;Lgk/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcl/b<",
        "Ldf/l;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcl/b;

.field final synthetic b:Ldf/x;


# direct methods
.method public constructor <init>(Lcl/b;Ldf/x;)V
    .locals 0

    iput-object p1, p0, Ldf/x$e;->a:Lcl/b;

    iput-object p2, p0, Ldf/x$e;->b:Ldf/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcl/c;Lgk/Continuation;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ldf/x$e;->a:Lcl/b;

    new-instance v1, Ldf/x$e$a;

    iget-object v2, p0, Ldf/x$e;->b:Ldf/x;

    invoke-direct {v1, p1, v2}, Ldf/x$e$a;-><init>(Lcl/c;Ldf/x;)V

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
