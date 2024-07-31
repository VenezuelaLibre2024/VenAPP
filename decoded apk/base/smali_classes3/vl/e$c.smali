.class public final Lvl/e$c;
.super Ldm/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvl/e;-><init>(Lql/y;Lql/a0;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic m:Lvl/e;


# direct methods
.method constructor <init>(Lvl/e;)V
    .locals 0

    iput-object p1, p0, Lvl/e$c;->m:Lvl/e;

    invoke-direct {p0}, Ldm/a;-><init>()V

    return-void
.end method


# virtual methods
.method protected z()V
    .locals 1

    iget-object v0, p0, Lvl/e$c;->m:Lvl/e;

    invoke-virtual {v0}, Lvl/e;->cancel()V

    return-void
.end method
