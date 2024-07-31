.class public interface abstract Lx6/v$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx6/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "b"
.end annotation


# static fields
.field public static final a:Lx6/v$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx6/w;

    invoke-direct {v0}, Lx6/w;-><init>()V

    sput-object v0, Lx6/v$b;->a:Lx6/v$b;

    return-void
.end method

.method private static synthetic a()V
    .locals 0

    return-void
.end method

.method public static synthetic b()V
    .locals 0

    invoke-static {}, Lx6/v$b;->a()V

    return-void
.end method


# virtual methods
.method public abstract release()V
.end method
