.class public final synthetic Lr1/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lr1/o;


# direct methods
.method public synthetic constructor <init>(Lr1/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr1/n;->a:Lr1/o;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lr1/n;->a:Lr1/o;

    invoke-virtual {v0}, Lr1/o;->m()V

    return-void
.end method
