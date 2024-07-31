.class public Lm2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm2/b;


# instance fields
.field private final a:Ll2/u;

.field final b:Landroid/os/Handler;

.field private final c:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lm2/c;->b:Landroid/os/Handler;

    new-instance v0, Lm2/c$a;

    invoke-direct {v0, p0}, Lm2/c$a;-><init>(Lm2/c;)V

    iput-object v0, p0, Lm2/c;->c:Ljava/util/concurrent/Executor;

    new-instance v0, Ll2/u;

    invoke-direct {v0, p1}, Ll2/u;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object v0, p0, Lm2/c;->a:Ll2/u;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lm2/c;->c:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public bridge synthetic b()Lm2/a;
    .locals 1

    invoke-virtual {p0}, Lm2/c;->d()Ll2/u;

    move-result-object v0

    return-object v0
.end method

.method public d()Ll2/u;
    .locals 1

    iget-object v0, p0, Lm2/c;->a:Ll2/u;

    return-object v0
.end method
