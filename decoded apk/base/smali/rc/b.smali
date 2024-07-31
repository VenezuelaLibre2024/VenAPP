.class public final synthetic Lrc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltc/a;


# instance fields
.field public final synthetic a:Lrc/d;


# direct methods
.method public synthetic constructor <init>(Lrc/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrc/b;->a:Lrc/d;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lrc/b;->a:Lrc/d;

    invoke-static {v0, p1, p2}, Lrc/d;->b(Lrc/d;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
