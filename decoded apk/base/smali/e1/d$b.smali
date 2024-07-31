.class Le1/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le1/d;->close()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Le1/d;


# direct methods
.method constructor <init>(Le1/d;)V
    .locals 0

    iput-object p1, p0, Le1/d$b;->a:Le1/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Le1/d$b;->a:Le1/d;

    invoke-virtual {v0}, Le1/d;->r()V

    return-void
.end method
