.class public final synthetic Lgc/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lgc/e;

.field public final synthetic b:Lgc/f;


# direct methods
.method public synthetic constructor <init>(Lgc/e;Lgc/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgc/d;->a:Lgc/e;

    iput-object p2, p0, Lgc/d;->b:Lgc/f;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lgc/d;->a:Lgc/e;

    iget-object v1, p0, Lgc/d;->b:Lgc/f;

    invoke-static {v0, v1}, Lgc/e;->e(Lgc/e;Lgc/f;)Lhc/a;

    move-result-object v0

    return-object v0
.end method
