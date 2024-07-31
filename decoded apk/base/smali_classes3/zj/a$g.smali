.class final Lzj/a$g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "g"
.end annotation


# static fields
.field static final a:Ldj/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Luj/j;

    invoke-direct {v0}, Luj/j;-><init>()V

    sput-object v0, Lzj/a$g;->a:Ldj/r;

    return-void
.end method
