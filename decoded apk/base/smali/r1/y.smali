.class public final synthetic Lr1/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lr1/a0;


# direct methods
.method public synthetic constructor <init>(Lr1/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr1/y;->a:Lr1/a0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lr1/y;->a:Lr1/a0;

    invoke-static {v0}, Lr1/a0;->b(Lr1/a0;)V

    return-void
.end method
