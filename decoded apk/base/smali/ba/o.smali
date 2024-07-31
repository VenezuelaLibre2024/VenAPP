.class public final synthetic Lba/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lba/q;

.field public final synthetic b:Lba/t;


# direct methods
.method public synthetic constructor <init>(Lba/q;Lba/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lba/o;->a:Lba/q;

    iput-object p2, p0, Lba/o;->b:Lba/t;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lba/o;->a:Lba/q;

    iget-object v1, p0, Lba/o;->b:Lba/t;

    iget v1, v1, Lba/t;->a:I

    invoke-virtual {v0, v1}, Lba/q;->e(I)V

    return-void
.end method
