.class public final Loj/e;
.super Ldj/b;
.source "SourceFile"


# instance fields
.field final a:Ldj/d;


# direct methods
.method public constructor <init>(Ldj/d;)V
    .locals 0

    invoke-direct {p0}, Ldj/b;-><init>()V

    iput-object p1, p0, Loj/e;->a:Ldj/d;

    return-void
.end method


# virtual methods
.method protected p(Ldj/c;)V
    .locals 1

    iget-object v0, p0, Loj/e;->a:Ldj/d;

    invoke-interface {v0, p1}, Ldj/d;->a(Ldj/c;)V

    return-void
.end method
