.class public final synthetic Lod/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpc/g;


# instance fields
.field public final synthetic a:Lpc/e0;


# direct methods
.method public synthetic constructor <init>(Lpc/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lod/d;->a:Lpc/e0;

    return-void
.end method


# virtual methods
.method public final a(Lpc/d;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lod/d;->a:Lpc/e0;

    invoke-static {v0, p1}, Lod/f;->f(Lpc/e0;Lpc/d;)Lod/f;

    move-result-object p1

    return-object p1
.end method
