.class public final synthetic Lr1/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lr1/r;


# direct methods
.method public synthetic constructor <init>(Lr1/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr1/q;->a:Lr1/r;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lr1/q;->a:Lr1/r;

    invoke-static {v0}, Lr1/r;->b(Lr1/r;)V

    return-void
.end method
