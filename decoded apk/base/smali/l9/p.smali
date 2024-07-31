.class public final synthetic Ll9/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ll9/a;


# direct methods
.method public synthetic constructor <init>(Ll9/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/p;->a:Ll9/a;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ll9/p;->a:Ll9/a;

    invoke-virtual {v0}, Ll9/a;->getViewSignals()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
