.class final Loj/h$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldj/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loj/h$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Loj/h$a;


# direct methods
.method constructor <init>(Loj/h$a;)V
    .locals 0

    iput-object p1, p0, Loj/h$a$a;->a:Loj/h$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Loj/h$a$a;->a:Loj/h$a;

    iget-object v0, v0, Loj/h$a;->a:Ldj/c;

    invoke-interface {v0}, Ldj/c;->a()V

    return-void
.end method

.method public b(Lgj/b;)V
    .locals 1

    iget-object v0, p0, Loj/h$a$a;->a:Loj/h$a;

    iget-object v0, v0, Loj/h$a;->b:Lkj/e;

    invoke-virtual {v0, p1}, Lkj/e;->b(Lgj/b;)Z

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Loj/h$a$a;->a:Loj/h$a;

    iget-object v0, v0, Loj/h$a;->a:Ldj/c;

    invoke-interface {v0, p1}, Ldj/c;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
