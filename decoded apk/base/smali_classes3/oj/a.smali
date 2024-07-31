.class public final Loj/a;
.super Ldj/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Loj/a$a;
    }
.end annotation


# instance fields
.field final a:[Ldj/d;


# direct methods
.method public constructor <init>([Ldj/d;)V
    .locals 0

    invoke-direct {p0}, Ldj/b;-><init>()V

    iput-object p1, p0, Loj/a;->a:[Ldj/d;

    return-void
.end method


# virtual methods
.method public p(Ldj/c;)V
    .locals 2

    new-instance v0, Loj/a$a;

    iget-object v1, p0, Loj/a;->a:[Ldj/d;

    invoke-direct {v0, p1, v1}, Loj/a$a;-><init>(Ldj/c;[Ldj/d;)V

    iget-object v1, v0, Loj/a$a;->d:Lkj/e;

    invoke-interface {p1, v1}, Ldj/c;->b(Lgj/b;)V

    invoke-virtual {v0}, Loj/a$a;->c()V

    return-void
.end method
