.class public final Loj/f;
.super Ldj/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Loj/f$a;
    }
.end annotation


# instance fields
.field final a:Ldj/d;

.field final b:Ljj/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/g<",
            "-",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldj/d;Ljj/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/d;",
            "Ljj/g<",
            "-",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ldj/b;-><init>()V

    iput-object p1, p0, Loj/f;->a:Ldj/d;

    iput-object p2, p0, Loj/f;->b:Ljj/g;

    return-void
.end method


# virtual methods
.method protected p(Ldj/c;)V
    .locals 2

    iget-object v0, p0, Loj/f;->a:Ldj/d;

    new-instance v1, Loj/f$a;

    invoke-direct {v1, p0, p1}, Loj/f$a;-><init>(Loj/f;Ldj/c;)V

    invoke-interface {v0, v1}, Ldj/d;->a(Ldj/c;)V

    return-void
.end method
