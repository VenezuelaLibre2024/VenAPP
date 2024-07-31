.class final Lr6/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr6/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:Lr6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr6/c;

    invoke-direct {v0}, Lr6/c;-><init>()V

    sput-object v0, Lr6/c$a;->a:Lr6/c;

    return-void
.end method

.method static synthetic a()Lr6/c;
    .locals 1

    sget-object v0, Lr6/c$a;->a:Lr6/c;

    return-object v0
.end method
