.class public final synthetic Lod/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lod/f;


# direct methods
.method public synthetic constructor <init>(Lod/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lod/b;->a:Lod/f;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lod/b;->a:Lod/f;

    invoke-static {v0}, Lod/f;->d(Lod/f;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
