.class public Lai/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final a:Lai/e;

.field final b:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lai/e;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lai/g;->a:Lai/e;

    iput-object p2, p0, Lai/g;->b:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lai/g;->b:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method
