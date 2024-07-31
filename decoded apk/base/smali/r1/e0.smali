.class public final synthetic Lr1/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/lang/Runnable;

.field public final synthetic b:Lr1/f0;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Runnable;Lr1/f0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr1/e0;->a:Ljava/lang/Runnable;

    iput-object p2, p0, Lr1/e0;->b:Lr1/f0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lr1/e0;->a:Ljava/lang/Runnable;

    iget-object v1, p0, Lr1/e0;->b:Lr1/f0;

    invoke-static {v0, v1}, Lr1/f0;->a(Ljava/lang/Runnable;Lr1/f0;)V

    return-void
.end method
