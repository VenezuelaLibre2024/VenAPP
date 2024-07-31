.class public final synthetic Lrc/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/b;


# instance fields
.field public final synthetic a:Lrc/d;


# direct methods
.method public synthetic constructor <init>(Lrc/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrc/a;->a:Lrc/d;

    return-void
.end method


# virtual methods
.method public final a(Luc/a;)V
    .locals 1

    iget-object v0, p0, Lrc/a;->a:Lrc/d;

    invoke-static {v0, p1}, Lrc/d;->c(Lrc/d;Luc/a;)V

    return-void
.end method
