.class public final synthetic Loi/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Loi/s;


# direct methods
.method public synthetic constructor <init>(Loi/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loi/i;->a:Loi/s;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Loi/i;->a:Loi/s;

    invoke-static {v0}, Loi/s;->e(Loi/s;)V

    return-void
.end method
