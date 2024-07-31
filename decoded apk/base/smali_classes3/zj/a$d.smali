.class final Lzj/a$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "d"
.end annotation


# static fields
.field static final a:Ldj/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Luj/c;

    invoke-direct {v0}, Luj/c;-><init>()V

    sput-object v0, Lzj/a$d;->a:Ldj/r;

    return-void
.end method
