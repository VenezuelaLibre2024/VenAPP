.class public final synthetic Lba/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lba/q;


# direct methods
.method public synthetic constructor <init>(Lba/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lba/m;->a:Lba/q;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lba/m;->a:Lba/q;

    invoke-virtual {v0}, Lba/q;->d()V

    return-void
.end method
